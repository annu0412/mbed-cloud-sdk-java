# SubscriptionsApi

All URIs are relative to *https://api.us-east-1.mbedcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v2SubscriptionsDelete**](SubscriptionsApi.md#v2SubscriptionsDelete) | **DELETE** v2/subscriptions | Remove all subscriptions
[**v2SubscriptionsDeviceIdDelete**](SubscriptionsApi.md#v2SubscriptionsDeviceIdDelete) | **DELETE** v2/subscriptions/{device-id} | Delete subscriptions from an endpoint
[**v2SubscriptionsDeviceIdGet**](SubscriptionsApi.md#v2SubscriptionsDeviceIdGet) | **GET** v2/subscriptions/{device-id} | Read endpoints subscriptions
[**v2SubscriptionsDeviceIdResourcePathDelete**](SubscriptionsApi.md#v2SubscriptionsDeviceIdResourcePathDelete) | **DELETE** v2/subscriptions/{device-id}/{resourcePath} | Remove a subscription
[**v2SubscriptionsDeviceIdResourcePathGet**](SubscriptionsApi.md#v2SubscriptionsDeviceIdResourcePathGet) | **GET** v2/subscriptions/{device-id}/{resourcePath} | Read subscription status
[**v2SubscriptionsDeviceIdResourcePathPut**](SubscriptionsApi.md#v2SubscriptionsDeviceIdResourcePathPut) | **PUT** v2/subscriptions/{device-id}/{resourcePath} | Subscribe to a resource path
[**v2SubscriptionsGet**](SubscriptionsApi.md#v2SubscriptionsGet) | **GET** v2/subscriptions | Get pre-subscriptions
[**v2SubscriptionsPut**](SubscriptionsApi.md#v2SubscriptionsPut) | **PUT** v2/subscriptions | Set pre-subscriptions


<a name="v2SubscriptionsDelete"></a>
# **v2SubscriptionsDelete**
> Void v2SubscriptionsDelete()

Remove all subscriptions

Removes subscriptions from every endpoint and resource. Note that this does not remove pre-subscriptions.  **Example usage:**      curl -X DELETE https://api.us-east-1.mbedcloud.com/v2/subscriptions -H &#39;authorization: Bearer {api-key}&#39;      

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    Void result = apiInstance.v2SubscriptionsDelete();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDelete");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="v2SubscriptionsDeviceIdDelete"></a>
# **v2SubscriptionsDeviceIdDelete**
> Void v2SubscriptionsDeviceIdDelete(deviceId)

Delete subscriptions from an endpoint

Deletes all resource subscriptions in a single endpoint.  **Example usage:**      curl -X DELETE \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id} \\       -H &#39;authorization: Bearer {api-key}&#39;        

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String deviceId = "deviceId_example"; // String | A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here. 
try {
    Void result = apiInstance.v2SubscriptionsDeviceIdDelete(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDeviceIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="v2SubscriptionsDeviceIdGet"></a>
# **v2SubscriptionsDeviceIdGet**
> String v2SubscriptionsDeviceIdGet(deviceId)

Read endpoints subscriptions

Lists all subscribed resources from a single endpoint.  **Example usage:**      curl -X GET \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id} \\       -H &#39;authorization: Bearer {api-key}&#39;        

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String deviceId = "deviceId_example"; // String | A unique Mbed Cloud device ID for the endpoint. Note that ID must be an exact match. You cannot use wildcards here. 
try {
    String result = apiInstance.v2SubscriptionsDeviceIdGet(deviceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDeviceIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| A unique Mbed Cloud device ID for the endpoint. Note that ID must be an exact match. You cannot use wildcards here.  |

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/uri-list

<a name="v2SubscriptionsDeviceIdResourcePathDelete"></a>
# **v2SubscriptionsDeviceIdResourcePathDelete**
> Void v2SubscriptionsDeviceIdResourcePathDelete(deviceId, resourcePath)

Remove a subscription

To remove an existing subscription from a resource path.  **Example usage:**      curl -X DELETE \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id}/{resourcePath} \\       -H &#39;authorization: Bearer {api-key}&#39;        

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String deviceId = "deviceId_example"; // String | A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here. 
String resourcePath = "resourcePath_example"; // String | The URL of the resource. 
try {
    Void result = apiInstance.v2SubscriptionsDeviceIdResourcePathDelete(deviceId, resourcePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDeviceIdResourcePathDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  |
 **resourcePath** | **String**| The URL of the resource.  |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="v2SubscriptionsDeviceIdResourcePathGet"></a>
# **v2SubscriptionsDeviceIdResourcePathGet**
> Void v2SubscriptionsDeviceIdResourcePathGet(deviceId, resourcePath)

Read subscription status

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String deviceId = "deviceId_example"; // String | A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here. 
String resourcePath = "resourcePath_example"; // String | The URL of the resource. 
try {
    Void result = apiInstance.v2SubscriptionsDeviceIdResourcePathGet(deviceId, resourcePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDeviceIdResourcePathGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  |
 **resourcePath** | **String**| The URL of the resource.  |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="v2SubscriptionsDeviceIdResourcePathPut"></a>
# **v2SubscriptionsDeviceIdResourcePathPut**
> Void v2SubscriptionsDeviceIdResourcePathPut(deviceId, resourcePath)

Subscribe to a resource path

The Mbed Cloud Connect eventing model consists of observable resources.  This means that endpoints can deliver updated resource content, periodically or with a more sophisticated  solution-dependent logic. The OMA LwM2M resource model including objects, object instances,  resources and resource instances is also supported.  Applications can subscribe to objects, object instances or individual resources to make the device  to provide value change notifications to Mbed Cloud Connect service. An application needs to call a &#x60;/notification/callback&#x60; method to get Mbed Cloud Connect to push notifications of the resource changes.  The manual subscriptions are removed during a full device registration and applications need to  re-subscribe at that point. To avoid this, you can use &#x60;/subscriptions&#x60; to set a pre-subscription.  **Example usage:**      curl -X PUT \\       https://api.us-east-1.mbedcloud.com/v2/subscriptions/{device-id}/{resourcePath} \\       -H &#39;authorization: Bearer {api-key}&#39; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
String deviceId = "deviceId_example"; // String | A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here. 
String resourcePath = "resourcePath_example"; // String | The URL of the resource. 
try {
    Void result = apiInstance.v2SubscriptionsDeviceIdResourcePathPut(deviceId, resourcePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsDeviceIdResourcePathPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| A unique Mbed Cloud device ID for the endpoint. Note that the ID must be an exact match. You cannot use wildcards here.  |
 **resourcePath** | **String**| The URL of the resource.  |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2SubscriptionsGet"></a>
# **v2SubscriptionsGet**
> PresubscriptionArray v2SubscriptionsGet()

Get pre-subscriptions

You can retrieve the pre-subscription data with the GET operation. The server returns with the same JSON structure  as described above. If there are no pre-subscribed resources, it returns with an empty array.  **Example usage:**      curl -X GET https://api.us-east-1.mbedcloud.com/v2/subscriptions -H &#39;authorization: Bearer {api-key}&#39;      

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
try {
    PresubscriptionArray result = apiInstance.v2SubscriptionsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PresubscriptionArray**](PresubscriptionArray.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="v2SubscriptionsPut"></a>
# **v2SubscriptionsPut**
> Void v2SubscriptionsPut(presubsription)

Set pre-subscriptions

Pre-subscription is a set of rules and patterns put by the application. When an endpoint registers  and its ID, type and registered resources match the pre-subscription data, Mbed Cloud Connect sends  subscription requests to the device automatically. The pattern may include the endpoint ID  (optionally having an &#x60;*&#x60; character at the end), endpoint type, a list of resources or expressions with an &#x60;*&#x60; character at the end. Subscriptions based on pre-subscriptions are done when device registers or does register update. To remove the pre-subscription data, put an empty array as a rule.  **Limits**:  - The maximum length of the endpoint name and endpoint type is 64 characters. - The maximum length of the resource path is 128 characters. - You can listen to 256 separate resource paths. - The maximum number of pre-subscription entries is 1024.          **Example request:**  &#x60;&#x60;&#x60; curl -X PUT \\   https://api.us-east-1.mbedcloud.com/v2/subscriptions \\   -H &#39;authorization: Bearer {api-key}&#39; \\   -H &#39;content-type: application/json&#39; \\   -d &#39;[          {            \&quot;endpoint-name\&quot;: \&quot;node-001\&quot;,            \&quot;resource-path\&quot;: [\&quot;/dev\&quot;]          },          {            \&quot;endpoint-type\&quot;: \&quot;Light\&quot;,            \&quot;resource-path\&quot;: [\&quot;/sen/_*\&quot;]          },          {            \&quot;endpoint-name\&quot;: \&quot;node*\&quot;          },          {            \&quot;endpoint-type\&quot;: \&quot;Sensor\&quot;          },          {            \&quot;resource-path\&quot;: [\&quot;/dev/temp\&quot;,\&quot;/dev/hum\&quot;]          }       ]&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.ApiException;
//import com.arm.mbed.cloud.sdk.internal.Configuration;
//import com.arm.mbed.cloud.sdk.internal.auth.*;
//import com.arm.mbed.cloud.sdk.internal.mds.api.SubscriptionsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SubscriptionsApi apiInstance = new SubscriptionsApi();
PresubscriptionArray presubsription = new PresubscriptionArray(); // PresubscriptionArray | Array of pre-subscriptions.
try {
    Void result = apiInstance.v2SubscriptionsPut(presubsription);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionsApi#v2SubscriptionsPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **presubsription** | [**PresubscriptionArray**](PresubscriptionArray.md)| Array of pre-subscriptions. |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain
