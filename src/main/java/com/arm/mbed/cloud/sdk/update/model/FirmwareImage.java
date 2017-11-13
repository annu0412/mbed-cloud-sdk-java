package com.arm.mbed.cloud.sdk.update.model;

import java.net.URL;
import java.util.Date;

import com.arm.mbed.cloud.sdk.annotations.DefaultValue;
import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.SdkModel;

@Preamble(description = "Firmware Image")
public class FirmwareImage implements SdkModel {
    /**
     * serialisation Id.
     */
    private static final long serialVersionUID = 4822611919285826743L;
    /**
     * The ID of the firmware image.
     */
    private String id;
    /**
     * The name of the object.
     */
    private String name;
    /**
     * The description of the object.
     */
    private String description;
    /**
     * The binary file of firmware image.
     */
    private DataFile dataFile;
    /**
     * the size in bytes of the uploaded firmware image binary.
     */
    @DefaultValue(value = "0")
    private final long datafileSize;
    /**
     * Checksum generated for the datafile.
     */
    private final String datafileChecksum;
    /**
     * The URL of the firmware image.
     */
    private final URL url;
    /**
     * The time the object was created.
     */
    @DefaultValue(value = "now()")
    private final Date createdAt;
    /**
     * The time the object was updated.
     */
    @DefaultValue(value = "now()")
    private final Date updatedAt;

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #FirmwareImage()} instead.
     * 
     * @param id
     *            id
     * @param url
     *            URL
     * @param datafileChecksum
     *            checksum
     * @param datafileSize
     *            file size
     * @param createdAt
     *            creation date
     * @param updatedAt
     *            update date
     */
    @Internal
    public FirmwareImage(String id, URL url, String datafileChecksum, long datafileSize, Date createdAt,
            Date updatedAt) {
        this(id, null, null, null, datafileSize, datafileChecksum, url, createdAt, updatedAt);
    }

    /**
     * Internal constructor.
     * <p>
     * Note: Should not be used. Use {@link #FirmwareImage()} instead.
     * 
     * @param id
     *            id
     * @param name
     *            name
     * @param description
     *            description
     * @param dataFile
     *            file
     * @param datafileSize
     *            file size
     * @param datafileChecksum
     *            checksum
     * @param url
     *            URL
     * @param createdAt
     *            creation date
     * @param updatedAt
     *            update date
     */
    @Internal
    public FirmwareImage(String id, String name, String description, DataFile dataFile, long datafileSize,
            String datafileChecksum, URL url, Date createdAt, Date updatedAt) {
        super();
        setId(id);
        this.datafileSize = datafileSize;
        this.datafileChecksum = datafileChecksum;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        setDataFile(dataFile);
        setDescription(description);
        setName(name);
    }

    /**
     * Constructor.
     */
    public FirmwareImage() {
        this(null, null, null, 0, new Date(), new Date());
    }

    /**
     * Gets Id.
     * 
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets Id.
     * 
     * @param id
     *            the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     * 
     * @param name
     *            the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets description.
     * 
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     * 
     * @param description
     *            the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets file size.
     * 
     * @return the datafileSize
     */
    public long getDatafileSize() {
        return datafileSize;
    }

    /**
     * Gets file.
     * 
     * @return the dataFile
     */
    public DataFile getDataFile() {
        return dataFile;
    }

    /**
     * Sets file.
     * 
     * @param dataFile
     *            the dataFile to set
     */
    public void setDataFile(DataFile dataFile) {
        this.dataFile = dataFile;
    }

    /**
     * Sets file from a path.
     * 
     * @param datafile
     *            the path to the datafile
     */
    public void setDatafile(String datafile) {
        setDataFile(new DataFile(datafile));
    }

    /**
     * Gets the URL.
     * 
     * @return the url
     */
    public URL getUrl() {
        return url;
    }

    /**
     * Gets the checksum.
     * 
     * @return the datafileChecksum
     */
    public String getDatafileChecksum() {
        return datafileChecksum;
    }

    /**
     * Gets creation date.
     * 
     * @return the createdAt
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * Gets update date.
     * 
     * @return the updatedAt
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Gets a clone.
     * 
     * @return a clone
     * 
     * @see java.lang.Object#clone()
     */
    @Override
    public FirmwareImage clone() throws CloneNotSupportedException {
        return new FirmwareImage(id, name, description, dataFile, datafileSize, datafileChecksum, url, createdAt,
                updatedAt);
    }

}