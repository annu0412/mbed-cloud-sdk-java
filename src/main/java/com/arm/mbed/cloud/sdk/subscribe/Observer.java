package com.arm.mbed.cloud.sdk.subscribe;

import java.util.concurrent.Future;

import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.TimePeriod;

import io.reactivex.Flowable;

@Preamble(description = "SDK Model object") // extends Serializable, Cloneable
public interface Observer<T> {// extends Iterator<Future<T>>, Iterable<Future<T>> {
    String getId();

    void addCallback(NotificationCallback<T> callback);

    void notify(T data) throws MbedCloudException;

    void removeCallback();

    void unsubscribe();

    Flowable<T> flow();

    Future<T> futureOne() throws MbedCloudException;

    Future<T> futureOne(@Nullable TimePeriod timeout) throws MbedCloudException;

    @Nullable
    T one() throws MbedCloudException;

    @Nullable
    T one(@Nullable TimePeriod timeout) throws MbedCloudException;

    int numberOfCallbacks();

    boolean isDisposed();
}
