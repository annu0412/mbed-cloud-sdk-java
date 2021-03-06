package com.arm.mbed.cloud.sdk;

import java.util.HashMap;
import java.util.Map;

import com.arm.mbed.cloud.sdk.annotations.API;
import com.arm.mbed.cloud.sdk.annotations.Daemon;
import com.arm.mbed.cloud.sdk.annotations.Experimental;
import com.arm.mbed.cloud.sdk.annotations.Module;
import com.arm.mbed.cloud.sdk.annotations.NonNull;
import com.arm.mbed.cloud.sdk.annotations.Nullable;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.AbstractApi;
import com.arm.mbed.cloud.sdk.common.ConnectionOptions;
import com.arm.mbed.cloud.sdk.common.JsonSerialiser;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.connect.model.Resource;
import com.arm.mbed.cloud.sdk.internal.mds.model.NotificationMessage;
import com.arm.mbed.cloud.sdk.subscribe.CloudSubscriptionManager;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateFilterOptions;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateObserver;
import com.arm.mbed.cloud.sdk.subscribe.model.FirstValue;
import com.arm.mbed.cloud.sdk.subscribe.model.ResourceValueObserver;
import com.arm.mbed.cloud.sdk.subscribe.model.SubscriptionFilterOptions;

import io.reactivex.BackpressureStrategy;

@Preamble(description = "Entry point for using the SDK")
@Module
@Experimental
/**
 * Entry point for using the SDK.
 */
public class MbedCloudClient extends AbstractApi implements AutoCloseable {

    private final Connect connectApi;

    /**
     * Mbed Cloud SDK constructor.
     *
     * @param options
     *            connection options @see {@link ConnectionOptions}.
     */
    public MbedCloudClient(ConnectionOptions options) {
        super(options, extendUserAgent());
        connectApi = new Connect(options);
    }

    /**
     * Creates a new Mbed Cloud SDK instance.
     *
     * @param options
     *            connection options @see {@link ConnectionOptions}.
     * @return an instance of the SDK.
     */
    public static MbedCloudClient createSdk(ConnectionOptions options) {
        return new MbedCloudClient(options);
    }

    private static Map<String, String> extendUserAgent() {
        final Map<String, String> extension = new HashMap<>(1);
        extension.put("HLA", "1.0.0-experimental");
        return extension;
    }

    /**
     * Gets subscription manager.
     *
     * @return subscription manager.
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    @API
    public CloudSubscriptionManager subscribe() throws MbedCloudException {
        return connectApi.subscribe();
    }

    /**
     * Subscribes to device state changes.
     *
     * @param filter
     *            filter to apply.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     * @return a registered observer which listens to some device state changes.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    @API
    @Nullable
    public DeviceStateObserver subscribe(@NonNull DeviceStateFilterOptions filter,
            @NonNull BackpressureStrategy strategy) throws MbedCloudException {
        return subscribe().deviceStateChanges(filter, strategy);
    }

    /**
     * Subscribes to resource value changes.
     *
     * @param filter
     *            filter to apply.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     *
     * @return a registered observer which listens to some resource value changes.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    public ResourceValueObserver subscribe(@NonNull SubscriptionFilterOptions filter,
            @NonNull BackpressureStrategy strategy) throws MbedCloudException {
        return subscribe().resourceValues(filter, strategy);
    }

    /**
     * Subscribes to resource value changes.
     *
     * @param filter
     *            filter to apply.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     * @param triggerMode
     *            mode describing when the first value should be retrieved
     * @return a registered observer which listens to some resource value changes.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    public ResourceValueObserver subscribe(@NonNull SubscriptionFilterOptions filter,
            @NonNull BackpressureStrategy strategy, FirstValue triggerMode) throws MbedCloudException {
        return subscribe().resourceValues(filter, strategy, triggerMode);
    }

    /**
     * Subscribes to value changes of a specific resource.
     *
     * @param resource
     *            resource to subscribe to.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     * @return a registered observer which listens to some resource value changes.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    public ResourceValueObserver subscribe(@NonNull Resource resource, @NonNull BackpressureStrategy strategy)
            throws MbedCloudException {
        return subscribe().resourceValues(resource, strategy);
    }

    /**
     * Subscribes to value changes of a specific resource.
     *
     * @param resource
     *            resource to subscribe to.
     * @param strategy
     *            backpressure strategy to apply to underlying communication channel. @see {@link BackpressureStrategy}
     * @param triggerMode
     *            mode describing when the first value should be retrieved
     * @return a registered observer which listens to some resource value changes.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    public ResourceValueObserver subscribe(@NonNull Resource resource, @NonNull BackpressureStrategy strategy,
            FirstValue triggerMode) throws MbedCloudException {
        return subscribe().resourceValues(resource, strategy, triggerMode);
    }

    /**
     * Allows notifications (received from a Webhook) to be injected into the notifications system.
     *
     * @param data
     *            The notification data to inject
     */
    @API
    public void notify(@Nullable NotificationMessage data) {
        connectApi.notify(data);
    }

    /**
     * Allows notifications expressed as a JSON string to be injected into the notifications system.
     *
     * @param dataAsJson
     *            The notification data to inject as JSON String.
     */
    @API
    public void notify(@Nullable String dataAsJson) {
        connectApi.notify(dataAsJson);
    }

    /**
     * Allows a notification to be injected into the notifications system.
     *
     * @param deserialiser
     *            JSON deserialiser to use.
     * @param dataAsJson
     *            The notification data to inject as JSON String.
     */
    @API
    public void notify(@Nullable JsonSerialiser deserialiser, @Nullable String dataAsJson) {
        connectApi.notify(deserialiser, dataAsJson);
    }

    /**
     * Stops any running daemon process/thread.
     *
     * @throws MbedCloudException
     *             if a problem occurs during the process.
     */
    @API
    @Daemon(stop = true)
    public void stop() throws MbedCloudException {
        connectApi.stopNotifications();
    }

    /**
     * Shuts down all daemon services.
     * <p>
     * This method should be called when quitting the SDK.
     * <p>
     * It does not stop the JVM though.
     *
     */
    @API
    @Daemon(shutdown = true)
    public void quit() {
        try {
            stop();
        } catch (MbedCloudException exception) {
            // Nothing to do
        }
        connectApi.shutdownConnectService();
    }

    /**
     * Similar to {@link #quit()}.
     */
    @Override
    public void close() throws Exception {
        quit();
    }

    @Override
    public String getModuleName() {
        return "SDK entry point";
    }

}
