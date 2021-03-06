package com.arm.mbed.cloud.sdk.common.listing;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.PageRequester;
import com.arm.mbed.cloud.sdk.common.SdkLogger;
import com.arm.mbed.cloud.sdk.common.SdkModel;

@Preamble(description = "Iterator over an entire result set of a truncated/paginated API operation.")
public class Paginator<T extends SdkModel> implements Iterator<T>, Iterable<T>, Cloneable {

    private final PageRequester<T> requester;
    private final ListOptions initialOptions;
    private ListOptions currentOptions;
    private ListOptions previousOptions;
    private ListOptions lastOptions;
    private ListResponse<T> currentPage;
    private Iterator<T> currentIterator;
    private long totalCount;
    private int lastPageIndex;
    private T previousElement;
    private T currentElement;
    private int pageIndex;
    private Integer pageSize;
    private long resultNumber;

    /**
     * Constructor.
     *
     * @param options
     *            list options to apply.
     * @param requester
     *            page requester.
     * @throws MbedCloudException
     *             if an error occurs during page request.
     */
    public Paginator(ListOptions options, PageRequester<T> requester) throws MbedCloudException {
        super();
        this.requester = requester;
        this.initialOptions = (options == null) ? new ListOptions() : options;
        setProperties(null);
        rewind();
    }

    /**
     * Sets current page.
     *
     * @param currentPage
     *            the currentPage to set
     */
    private final void setCurrentPage(ListResponse<T> currentPage) {
        if (currentPage == null) {
            this.currentPage = null;
            this.currentIterator = null;
        } else {
            resultNumber += (this.currentPage == null) ? 0 : this.currentPage.getNumberOfElements();
            this.currentPage = currentPage;
            this.currentIterator = this.currentPage.iterator();
            this.currentElement = currentPage.first();
            this.pageIndex++;
        }
    }

    private final void fetchNewPage() throws MbedCloudException {
        if (requester == null) {
            return;
        }
        if (hasNextPage()) {
            final ListOptions optionsToStore = currentOptions.clone();
            if (currentPage != null) {
                currentOptions.setAfter(findNextPageCursor());
            }
            final int firstResultIndex = (pageSize == null)
                    ? (currentPage == null) ? 0 : (pageIndex + 1) * currentPage.getNumberOfElements()
                    : (pageIndex + 1) * pageSize.intValue();
            gotoAPage(currentOptions, pageIndex + 1);
            previousOptions = optionsToStore;
            resultNumber = firstResultIndex;
        } else {
            setCurrentPageAsLast();
        }
    }

    private String findNextPageCursor() {
        return currentPage.hasContinuationMarker() ? currentPage.getContinuationMarker()
                : fetchAfterId(currentPage.last());
    }

    private void setCurrentPageAsLast() {
        lastOptions = currentOptions.clone();
        lastPageIndex = pageIndex;
    }

    private final void gotoAPage(ListOptions pageOptions, int index) throws MbedCloudException {
        if (pageOptions == null) {
            throw new MbedCloudException("Cannot move to page [" + index + "]");
        }
        pageIndex = index - 1;
        previousElement = null;
        previousOptions = null;
        setCurrentPage(requester.requestNewPage(pageOptions));
    }

    private final String fetchAfterId(T last) {
        if (last == null) {
            return null;
        }
        return last.getId();
    }

    private final long fetchTotalCount() {
        final ListOptions opt = initialOptions.clone();
        opt.setPageSize(Integer.valueOf(2));
        opt.includeTotalCount();
        ListResponse<T> response = null;
        try {
            response = requester.requestNewPage(opt);
        } catch (MbedCloudException exception) {
            SdkLogger.getLogger().logError("Error occurred when trying to fetch record total count", exception);
            return 0;
        }
        return (response == null) ? 0 : response.getTotalCount();

    }

    /**
     * Gets page requester.
     *
     * @return the page requester.
     */
    public PageRequester<T> getRequester() {
        return requester;
    }

    /**
     * Gets an iterator (itself) over the whole collection.
     *
     */
    @Override
    public Iterator<T> iterator() {
        return this;
    }

    /**
     * Gets the current page's number in the pager sequence.
     *
     * @return page index.
     */
    public long getPageIndex() {
        return pageIndex;
    }

    /**
     * Gets the number of elements of the current page.
     *
     * @return the number of elements on the current page.
     */
    public int getNumberOfPageElements() {
        return currentPage == null ? 0
                : currentPage.getPageSize() == 0 ? currentPage.getNumberOfElements() : currentPage.getPageSize();

    }

    /**
     * Gets the total number of elements in the collection.
     * <p>
     * Be aware that if the paginator does not currently have this information, an additional call to the server will be
     * performed.
     *
     * @return the total count of elements in the collection.
     */
    public long getElementsTotal() {
        if (totalCount > 0) {
            return totalCount;
        }
        if (currentPage == null || currentPage.getTotalCount() == 0) {
            totalCount = fetchTotalCount();
        } else {
            totalCount = currentPage.getTotalCount();
        }
        return totalCount;
    }

    /**
     * Gets the total number of pages in the collection.
     *
     * @return the total number of pages in the collection.
     */
    public int getPagesNumber() {
        getLastPage();
        return lastPageIndex + 1;
    }

    /**
     * Tries to state whether there are previous records to the current one. *
     * <p>
     * Only works if collection was browsed in a sequence. If jumps were made using {@link #first()}, {@link #last()},
     * etc., then this may not work if currently present at the start of a new page.
     *
     * @return True if there are previous elements to the current one in the collection. False otherwise.
     */
    public boolean hasPrevious() {
        return previousElement != null;
    }

    /**
     * Tries to get previous record but does not move to it.
     * <p>
     * Only works if collection was browsed in a sequence. If jumps were made using {@link #first()}, {@link #last()},
     * etc., then this may not work if currently present at the start of a new page.
     *
     * @return previous element. Null if there is no previous element in the collection.
     */
    public @Nullable T previous() {
        if (previousElement != null) {
            return previousElement;
        }

        if (hasPreviousPage()) {
            final ListResponse<T> previousPage = getPreviousPage();
            if (previousPage == null) {
                return null;
            }
            previousElement = previousPage.last();

        }
        return previousElement;
    }

    /**
     * Tries to state whether there are pages before the current one.
     * <p>
     * Only works if collection was browsed in a sequence. If jumps were made using {@link #first()}, {@link #last()},
     * etc., then this will always return false.
     *
     * @return True if there are pages before the current one. False otherwise.
     */
    public boolean hasPreviousPage() {
        return previousOptions != null;
    }

    /**
     * Tries to get previous page in the collection but does not move to it. *
     * <p>
     * Only works if collection was browsed in a sequence. If jumps were made using {@link #first()}, {@link #last()},
     * etc., then this will always return null.
     *
     * @return previous page in the collection. Null if previous page could not be retrieved or if current page is the
     *         first one.
     */
    public @Nullable ListResponse<T> getPreviousPage() {
        if (!hasPreviousPage()) {
            return null;
        }
        try {
            return requester.requestNewPage(previousOptions);
        } catch (MbedCloudException exception) {
            SdkLogger.getLogger().logError("Error occurred when requesting next page", exception);
            return null;
        }
    }

    /**
     * Gets current record.
     *
     * @return current element. Null if there is no current element.
     */
    public @Nullable T current() {
        return currentElement;
    }

    /**
     * Gets current page.
     *
     * @return the currentPage
     */
    public @Nullable ListResponse<T> getCurrentPage() {
        return currentPage;
    }

    /**
     * States whether there are more records to fetch.
     *
     * @return True if there are more elements in the collection. False otherwise.
     */
    @Override
    public boolean hasNext() {
        if (currentIterator == null || currentPage == null) {
            return false;
        }
        if (initialOptions.hasMaxResults() && resultNumber + 1 > initialOptions.getMaxResults().longValue()) {
            return false;
        }
        return currentIterator.hasNext() ? true : !isLastPage();
    }

    /**
     * Gets next record and moves to it.
     * <p>
     * The paginator will iterate through all the elements of a page and then move to elements in the next pages if
     * there are any.
     *
     * @return next element. Null if there is not any other element in the collection.
     */
    @SuppressWarnings("unchecked")
    @Override
    public @Nullable T next() {
        previousElement = (currentElement == null) ? null : (T) currentElement.clone();
        if (currentIterator == null || !currentIterator.hasNext()) {
            try {
                fetchNewPage();
            } catch (MbedCloudException exception) {
                SdkLogger.getLogger().logError("Error occurred when requesting next page", exception);
                return null;
            }
        }
        if (initialOptions.hasMaxResults() && resultNumber + 1 > initialOptions.getMaxResults().longValue()) {
            setCurrentPageAsLast();
            currentElement = null;
            return currentElement;
        }
        if (currentIterator != null && currentIterator.hasNext()) {
            currentElement = currentIterator.next();
            resultNumber++;
        } else {
            currentElement = null;
        }

        return currentElement;
    }

    /**
     * States whether there are more pages available.
     *
     * @return True if there are pages after the current one. False otherwise.
     */
    public boolean hasNextPage() {
        if (currentPage == null) {
            return true;
        }
        if (initialOptions.hasMaxResults() && isLastElementInCurrentPage()) {
            return false;
        }
        return currentPage.hasMore();

    }

    private boolean isLastElementInCurrentPage() {
        return pageSize != null && pageIndex + 1 > initialOptions.getMaxResults().longValue() / pageSize.intValue();
    }

    /**
     * Gets the next page of the collection and moves to it.
     *
     * @return the next page of the collection. Null if current page is the last page in the collection.
     */
    public @Nullable ListResponse<T> getNextPage() {
        if (!hasNextPage()) {
            return null;
        }
        try {
            fetchNewPage();
        } catch (MbedCloudException exception) {
            SdkLogger.getLogger().logError("Error occurred while browsing the collection (requesting a new page)",
                    exception);
            return null;
        }

        return currentPage;
    }

    /**
     * Gets the first element (first element of the first page).
     *
     * @return the first element of the collection.
     */
    public @Nullable T first() {
        currentIterator = null;
        final ListResponse<T> firstPage = getFirstPage();
        if (firstPage == null) {
            return null;
        }
        currentIterator = firstPage.iterator();
        return currentIterator.next();
    }

    /**
     * Gets the first page of the collection.
     *
     * @return the first page of the collection.
     */
    public @Nullable ListResponse<T> getFirstPage() {
        try {
            if (!isFirstPage()) {
                rewind();
            }
        } catch (MbedCloudException exception) {
            SdkLogger.getLogger().logError("Error occurred while browsing the collection (going to the heading page)",
                    exception);
            return null;
        }
        return currentPage;
    }

    /**
     * States whether the current page is the first page of the collection.
     *
     * @return true if current page is the first one of the collection. False otherwise.
     */
    public boolean isFirstPage() {
        return currentPage == null || initialOptions.equals(currentOptions);
    }

    /**
     * Gets the last element (last element of the last page).
     * <p>
     * Be aware that this method has a cost. It will browse all pages until the last one and then fetch its last
     * element.
     *
     * @return the last element of the collection.
     */
    public @Nullable T last() {
        final ListResponse<T> lastPage = getLastPage();
        if (lastPage == null) {
            return null;
        }
        if (initialOptions.hasMaxResults()) {
            int indexLastElement = (int) (initialOptions.getMaxResults().longValue()
                    - (getPagesNumber() - 1) * (pageSize == null ? lastPage.getPageSize() : pageSize.intValue())) - 1;
            if (indexLastElement < 0) {
                indexLastElement = 0;
            } else if (indexLastElement > lastPage.getNumberOfElements() - 1) {
                indexLastElement = lastPage.getNumberOfElements() - 1;
            }
            return lastPage.get(indexLastElement);
        }
        return lastPage.last();
    }

    /**
     * Gets the last page of the collection.
     * <p>
     * Be aware that this method has a cost. It will browse all pages until the last one is fetched and will then return
     * it.
     *
     * @return the last page of the collection.
     */
    public @Nullable ListResponse<T> getLastPage() {
        try {
            if (!isLastPage()) {
                if (lastOptions != null) {
                    gotoAPage(lastOptions, lastPageIndex);
                }
                while (!isLastPage()) {
                    fetchNewPage();
                }
                lastPageIndex = pageIndex;
            }
        } catch (MbedCloudException exception) {
            SdkLogger.getLogger().logError("Error occurred while browsing the collection (requesting a new page)",
                    exception);
            return null;
        }
        return currentPage;
    }

    /**
     * States whether the current page is the last page of the collection.
     *
     * @return true if current page is the last one of the collection. False otherwise.
     */
    public boolean isLastPage() {
        if (currentPage == null) {
            return true;
        }
        if (initialOptions.hasMaxResults() && isLastElementInCurrentPage()) {
            return true;

        }
        return !currentPage.hasMore();
    }

    /**
     * Rewinds this iterator to the start of the collection.
     *
     * @throws MbedCloudException
     *             if an error occurred during the process.
     */
    public final void rewind() throws MbedCloudException {
        currentPage = null;
        currentIterator = null;
        currentOptions = this.initialOptions.clone();
        currentElement = null;
        previousElement = null;
        fetchNewPage();

        resultNumber = 0;
        previousOptions = null;
        pageIndex = 0;
        pageSize = (currentPage == null) ? currentOptions.getPageSize() : Integer.valueOf(currentPage.getPageSize());
    }

    /**
     * Gets a list of all elements present in this collection.
     * <p>
     * Warning: This method can be really expensive and potentially harmful if the number of elements requested is
     * important as all of them will be stored in memory.
     * <p>
     * Moreover, no caching of the data is performed. Therefore, every call to this method will entail iteration over
     * the whole collection.
     *
     * @return a list containing all the elements present in this collection.
     * @throws MbedCloudException
     *             if a problem occurs during the processing
     */
    public List<T> all() throws MbedCloudException {
        Paginator<T> clone;
        try {
            clone = clone();
        } catch (CloneNotSupportedException exception) {
            throw new MbedCloudException(exception);
        }
        clone.rewind();
        final List<T> all = new LinkedList<>();
        while (clone.hasNext()) {
            all.add(clone.next());
        }
        return all;
    }

    private void setProperties(Paginator<T> other) {
        if (other == null) {
            lastOptions = null;
            totalCount = 0;
            lastPageIndex = 0;
            pageSize = null;
        } else {
            lastOptions = other.lastOptions;
            totalCount = other.totalCount;
            lastPageIndex = other.lastPageIndex;
            pageSize = other.pageSize;
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#clone()
     */
    @Override
    public Paginator<T> clone() throws CloneNotSupportedException {
        try {
            final Paginator<T> clone = new Paginator<>(initialOptions.clone(), requester);
            clone.setProperties(this);
            return clone;
        } catch (MbedCloudException exception) {
            // Nothing to do
        }
        throw new CloneNotSupportedException();
    }

}
