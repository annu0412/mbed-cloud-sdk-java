package com.arm.mbed.cloud.sdk.subscribe.store;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.CallbackWithException;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.listing.FilterOptions;
import com.arm.mbed.cloud.sdk.subscribe.Observer;
import com.arm.mbed.cloud.sdk.subscribe.SubscriptionType;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateFilterOptions;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateNotification;
import com.arm.mbed.cloud.sdk.subscribe.model.DeviceStateObserver;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

@Preamble(description = "Store for device state changes observers")
@Internal
public class DeviceStateChangeSubscriptionObserverStore
        extends AbstractSubscriptionObserverStore<DeviceStateNotification> {

    public DeviceStateChangeSubscriptionObserverStore(Scheduler scheduler) {
        super(SubscriptionType.DEVICE_STATE_CHANGE, scheduler);
    }

    @Override
    protected Observer<?> buildObserver(String channelId, Flowable<DeviceStateNotification> flow, FilterOptions filter,
            CallbackWithException<FilterOptions, MbedCloudException> actionOnSubscription,
            CallbackWithException<FilterOptions, MbedCloudException> actionOnUnsubscription) {
        return new DeviceStateObserver(this, channelId, flow, (DeviceStateFilterOptions) filter);
    }

}
