package com.arm.mbed.cloud.sdk.internal.mds.api;

import com.arm.mbed.cloud.sdk.internal.mds.ApiClient;
import com.arm.mbed.cloud.sdk.internal.mds.model.NotificationMessage;
import com.arm.mbed.cloud.sdk.internal.mds.model.Webhook;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private NotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationsApi.class);
    }

    /**
     * Delete notification Long Poll channel
     *
     * To delete a notification Long Poll channel. This is required to change the channel from Long Poll to a callback. You should not make a GET &#x60;/v2/notification/pull&#x60; call for 2 minutes after channel was deleted, because it can implicitly recreate the pull channel. You can also have some random responses with payload or 410 GONE with \&quot;CHANNEL_DELETED\&quot; as a payload or 200/204 until the old channel is purged.  **Example usage:**     curl -X DELETE https://api.us-east-1.mbedcloud.com/v2/notification/pull -H &#39;authorization: Bearer {api-key}&#39; 
     */
    @Test
    public void deleteLongPollChannelTest() {
        // Void response = api.deleteLongPollChannel();

        // TODO: test validations
    }
    /**
     * Delete callback URL
     *
     * Deletes the callback URL.  **Example usage:**      curl -X DELETE https://api.us-east-1.mbedcloud.com/v2/notification/callback -H &#39;authorization: Bearer {api-key}&#39; 
     */
    @Test
    public void deregisterWebhookTest() {
        // Void response = api.deregisterWebhook();

        // TODO: test validations
    }
    /**
     * Check callback URL
     *
     * Shows the current callback URL if it exists.  **Example usage:**      curl -X GET https://api.us-east-1.mbedcloud.com/v2/notification/callback -H &#39;authorization: Bearer {api-key}&#39; 
     */
    @Test
    public void getWebhookTest() {
        // Webhook response = api.getWebhook();

        // TODO: test validations
    }
    /**
     * Get notifications using Long Poll
     *
     * In this case, notifications are delivered through HTTP long poll requests. The HTTP request is kept open until an event notification or a batch of event notifications are delivered to the client or the request times out (response code 204). In both cases, the client should open a new polling connection after the previous one closes. Only a single long polling connection per API key can be ongoing at any given time. You must have a persistent connection (Connection keep-alive header in the request) to avoid excess TLS handshakes.  The pull channel is implicitly created by the first GET call to &#x60;/v2/notification/pull&#x60;. It is refreshed on each GET call. If the channel is not polled for a long time (10 minutes) - it expires and will be deleted. This means that no notifications will stay in the queue between polls. A channel can be also deleted explicitly by a DELETE call.  **Note:** If you cannot have a public facing callback URL, for example when developing on your local machine, you can use long polling to check for new messages. However, **long polling is deprecated** and will likely be replaced in future. It is meant only for experimentation and not for commercial usage. The proper method to receive notifications is a **notification callback**. There can only be one notification channel per API key at a time in Mbed Cloud Connect. If a callback notification channel already exists, you need to delete it before creating a long poll notification channel, and vice-versa.  **Example usage:**      curl -X GET https://api.us-east-1.mbedcloud.com/v2/notification/pull -H &#39;authorization: Bearer {api-key}&#39; 
     */
    @Test
    public void longPollNotificationsTest() {
        // NotificationMessage response = api.longPollNotifications();

        // TODO: test validations
    }
    /**
     * Register a callback URL
     *
     * Register a URL to which the server should deliver notifications of the subscribed resource changes. To get notifications pushed, you also need to place the subscriptions. The maximum length of the URL, header keys and values, all combined, is 400 characters. Notifications are delivered as PUT messages to the HTTP server defined by the client with a subscription server message. The given URL should be accessible and respond to the PUT request with response code of 200 or 204. Mbed Cloud Connect tests the callback URL with an empty payload when the URL is registered. For more information on callback notification, see [NotificationMessage](/docs/current/service-api-references/mbed-cloud-connect.html#models).  **Optional headers in a callback message:**  You can set optional headers to a callback in a **Webhook** object. Mbed Cloud Connect will include the header and key pairs to the notification messages send them to callback URL. As the callback URL&#39;s are API key specific also the headers are.  One possible use for the additional headers is to check the origin of a PUT request and also distinguish the application (API key) to which the notification belongs to.  **Note**: Only one callback URL per an API key can be active. If you register a new URL while another one is already active, it replaces the active one. There can be only one notification channel at a time. If the Long Poll notification is already present, you need to delete it before setting the callback URL.  **Expiration of a callback URL:**  A callback can expire when Mbed Cloud cannot deliver a notification due to a connection timeout or an error response (4xx or 5xx). After each delivery failure, Mbed Cloud sets an exponential back off time and makes a retry attempt after that. The first retry delay is 1 second, then 2s, 4s, 8s, ..., 2min, 2min. The maximum retry delay is 2 minutes. The callback URL will be removed if all retries fail withing 24 hours. More about [notification sending logic](/docs/current/integrate-web-app/event-notification.html#notification-sending-logic).  **Supported callback URL protocols:**  Currently, only HTTP and HTTPS protocols are supported.  **HTTPS callback URLs:**  When delivering a notification to an HTTPS based callback URL, Mbed Cloud Connect will present a valid client certificate to identify itself. The certificate is signed by a trusted certificate authorithy (GlobalSign) with a Common Name (CN) set to notifications.mbedcloud.com.  **Example usage:**  This example command shows how to set your callback URL and API key. It also sets an optional header authorization. When Mbed Cloud Connect calls your callback URL, the call contains the authorization header with the defined value.      curl -X PUT \\       https://api.us-east-1.mbedcloud.com/v2/notification/callback \\       -H &#39;authorization: Bearer {api-key}&#39; \\       -H &#39;content-type: application/json&#39; \\       -d &#39;{       \&quot;url\&quot;: \&quot;{callback-url}\&quot;,       \&quot;headers\&quot;: {\&quot;authorization\&quot; : \&quot;f4b93d6e-4652-4874-82e4-41a3ced0cd56\&quot;}       }&#39; 
     */
    @Test
    public void registerWebhookTest() {
        Webhook webhook = null;
        // Void response = api.registerWebhook(webhook);

        // TODO: test validations
    }
}
