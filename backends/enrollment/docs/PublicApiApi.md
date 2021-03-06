# PublicApiApi

All URIs are relative to *http://api.us-east-1.mbedcloud.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkDeviceEnrollment**](PublicApiApi.md#createBulkDeviceEnrollment) | **POST** v3/device-enrollments-bulk-uploads | Bulk upload
[**createDeviceEnrollment**](PublicApiApi.md#createDeviceEnrollment) | **POST** v3/device-enrollments | Place an enrollment claim for one or several devices.
[**deleteDeviceEnrollment**](PublicApiApi.md#deleteDeviceEnrollment) | **DELETE** v3/device-enrollments/{id} | Delete an enrollment by ID.
[**getBulkDeviceEnrollment**](PublicApiApi.md#getBulkDeviceEnrollment) | **GET** v3/device-enrollments-bulk-uploads/{id} | Get bulk upload entity
[**getDeviceEnrollment**](PublicApiApi.md#getDeviceEnrollment) | **GET** v3/device-enrollments/{id} | Get details of an enrollment by ID.
[**getDeviceEnrollments**](PublicApiApi.md#getDeviceEnrollments) | **GET** v3/device-enrollments | Get enrollment list.


<a name="createBulkDeviceEnrollment"></a>
# **createBulkDeviceEnrollment**
> BulkResponse createBulkDeviceEnrollment(enrollmentIdentities)

Bulk upload

With bulk upload you can upload a CSV file containing a number of enrollment IDs.  **Example usage:** &#x60;&#x60;&#x60; curl -X POST \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ -F &#39;enrollment_identities&#x3D;@/path/to/enrollments/enrollments.csv&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads  &#x60;&#x60;&#x60; **Example csv File:** 1. First line is assumed to be the header. Content of the header is not validated. 2. Each line can contain comma separated values where 1st value is always assumed to be the Enrollment ID. 3. Only one enrollment ID is expected in one line. 4. Valid Enrollments begins with A followed by a - and 95 charactors in the format as given below. 5. Valid Enrollment identities may be enclosed with in quotes. 6. UTF-8 encoding is expected.  &#x60;&#x60;&#x60; \&quot;enrollment_identity\&quot; \&quot;A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:44:71:93:23:22:15:43:23:12\&quot;, \&quot;A-4E:63:2D:AE:14:BC:D1:09:77:21:95:44:ED:34:06:57:1E:03:B1:EF:0E:F2:59:25:48:44:71:22:15:43:23:12\&quot;,  &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
File enrollmentIdentities = new File("/path/to/file.txt"); // File | Enrollment identities CSV file. Maximum file size is 10MB. 
try {
    BulkResponse result = apiInstance.createBulkDeviceEnrollment(enrollmentIdentities);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#createBulkDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrollmentIdentities** | **File**| Enrollment identities CSV file. Maximum file size is 10MB.  |

### Return type

[**BulkResponse**](BulkResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="createDeviceEnrollment"></a>
# **createDeviceEnrollment**
> EnrollmentIdentity createDeviceEnrollment(enrollmentIdentity)

Place an enrollment claim for one or several devices.

When the device connects to the bootstrap server and provides the enrollment ID, it will be assigned to your account. &lt;br&gt; **Example usage:** &#x60;&#x60;&#x60; curl -X POST \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ -H &#39;content-type: application/json&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments \\ -d &#39;{\&quot;enrollment_identity\&quot;: \&quot;A-35:e7:72:8a:07:50:3b:3d:75:96:57:52:72:41:0d:78:cc:c6:e5:53:48:c6:65:58:5b:fa:af:4d:2d:73:95:c5\&quot;}&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
EnrollmentId enrollmentIdentity = new EnrollmentId(); // EnrollmentId | 
try {
    EnrollmentIdentity result = apiInstance.createDeviceEnrollment(enrollmentIdentity);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#createDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enrollmentIdentity** | [**EnrollmentId**](EnrollmentId.md)|  |

### Return type

[**EnrollmentIdentity**](EnrollmentIdentity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDeviceEnrollment"></a>
# **deleteDeviceEnrollment**
> Void deleteDeviceEnrollment(id)

Delete an enrollment by ID.

To free a device from your account you can delete the enrollment claim. To bypass the device ownership, you need to delete the enrollment and do a factory reset for the device. For more information, see [Transferring the ownership using First-to-Claim](/docs/current/connecting/device-ownership.html). &lt;br&gt; **Example usage:** &#x60;&#x60;&#x60; curl -X DELETE \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments/{id} &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
String id = "id_example"; // String | Enrollment identity.
try {
    Void result = apiInstance.deleteDeviceEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#deleteDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Enrollment identity. |

### Return type

[**Void**](.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getBulkDeviceEnrollment"></a>
# **getBulkDeviceEnrollment**
> BulkResponse getBulkDeviceEnrollment(id)

Get bulk upload entity

Provides info about bulk upload for the given ID. For example bulk status and processed count of enrollment identities. Info includes also links for the bulk upload reports. **Example usage:** &#x60;&#x60;&#x60; curl -X GET \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads/{id} &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
String id = "id_example"; // String | Bulk create task entity ID
try {
    BulkResponse result = apiInstance.getBulkDeviceEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#getBulkDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Bulk create task entity ID |

### Return type

[**BulkResponse**](BulkResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceEnrollment"></a>
# **getDeviceEnrollment**
> EnrollmentIdentity getDeviceEnrollment(id)

Get details of an enrollment by ID.

To check the enrollment info in detail, for example date of claim and expiration date. **Example usage:** &#x60;&#x60;&#x60; curl -X GET \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments/{id} &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
String id = "id_example"; // String | Enrollment identity.
try {
    EnrollmentIdentity result = apiInstance.getDeviceEnrollment(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#getDeviceEnrollment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| Enrollment identity. |

### Return type

[**EnrollmentIdentity**](EnrollmentIdentity.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDeviceEnrollments"></a>
# **getDeviceEnrollments**
> EnrollmentIdentities getDeviceEnrollments(limit, after, order, include)

Get enrollment list.

Provides a list of pending and claimed enrollments. **Example usage:** &#x60;&#x60;&#x60; curl -X GET \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ https://api.us-east-1.mbedcloud.com/v3/device-enrollments &#x60;&#x60;&#x60; With query parameters: &#x60;&#x60;&#x60; curl -X GET \\ -H &#39;Authorization: Bearer &lt;valid access token&gt;&#39; \\ &#39;https://api.us-east-1.mbedcloud.com/v3/device-enrollments?limit&#x3D;10&#39; &#x60;&#x60;&#x60; 

### Example
```java
// Import classes:
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiClient;
//import com.arm.mbed.cloud.sdk.internal.enrollment.ApiException;
//import com.arm.mbed.cloud.sdk.internal.enrollment.Configuration;
//import com.arm.mbed.cloud.sdk.internal.enrollment.auth.*;
//import com.arm.mbed.cloud.sdk.internal.enrollment.api.PublicApiApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PublicApiApi apiInstance = new PublicApiApi();
Integer limit = 56; // Integer | Number of results to be returned. Between 2 and 1000, inclusive.
String after = "after_example"; // String | Entity ID to fetch after.
String order = "ASC"; // String | ASC or DESC
String include = "include_example"; // String | Comma-separated additional data to return. Currently supported: total_count.
try {
    EnrollmentIdentities result = apiInstance.getDeviceEnrollments(limit, after, order, include);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PublicApiApi#getDeviceEnrollments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to be returned. Between 2 and 1000, inclusive. | [optional]
 **after** | **String**| Entity ID to fetch after. | [optional]
 **order** | **String**| ASC or DESC | [optional] [default to ASC] [enum: ASC, DESC]
 **include** | **String**| Comma-separated additional data to return. Currently supported: total_count. | [optional]

### Return type

[**EnrollmentIdentities**](EnrollmentIdentities.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

