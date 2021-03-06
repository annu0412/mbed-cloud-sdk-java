package com.arm.mbed.cloud.sdk.subscribe.store;

import com.arm.mbed.cloud.sdk.annotations.Internal;
import com.arm.mbed.cloud.sdk.annotations.Preamble;
import com.arm.mbed.cloud.sdk.common.CallbackWithException;
import com.arm.mbed.cloud.sdk.common.MbedCloudException;
import com.arm.mbed.cloud.sdk.common.listing.FilterOptions;
import com.arm.mbed.cloud.sdk.subscribe.Observer;
import com.arm.mbed.cloud.sdk.subscribe.SubscriptionType;
import com.arm.mbed.cloud.sdk.subscribe.model.ResourceValueNotification;
import com.arm.mbed.cloud.sdk.subscribe.model.ResourceValueObserver;
import com.arm.mbed.cloud.sdk.subscribe.model.SubscriptionFilterOptions;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;

@Preamble(description = "Store for resource value observers")
@Internal
public class ResourceValueSubscriptionObserverStore
        extends AbstractSubscriptionObserverStore<ResourceValueNotification> {

    public ResourceValueSubscriptionObserverStore(Scheduler scheduler) {
        super(SubscriptionType.NOTIFICATION, scheduler);
    }

    @Override
    protected Observer<?> buildObserver(String channelId, Flowable<ResourceValueNotification> flow,
            FilterOptions filter, CallbackWithException<FilterOptions, MbedCloudException> actionOnSubscription,
            CallbackWithException<FilterOptions, MbedCloudException> actionOnUnsubscription) {
        return new ResourceValueObserver(this, channelId, flow, (SubscriptionFilterOptions) filter,
                actionOnSubscription, actionOnUnsubscription);
    }

}
