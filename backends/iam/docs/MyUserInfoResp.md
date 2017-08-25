
# MyUserInfoResp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**username** | **String** | A username containing alphanumerical letters and -,._@+&#x3D; characters. |  [optional]
**loginHistory** | [**List&lt;LoginHistory&gt;**](LoginHistory.md) | Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format. |  [optional]
**creationTime** | **Long** | A timestamp of the user creation in the storage, in milliseconds. |  [optional]
**fullName** | **String** | The full name of the user. |  [optional]
**id** | **String** | The UUID of the user. | 
**lastLoginTime** | **Long** | A timestamp of the latest login of the user, in milliseconds. |  [optional]
**isGtcAccepted** | **Boolean** | A flag indicating that the General Terms and Conditions has been accepted. |  [optional]
**etag** | **String** | API resource entity version. | 
**isMarketingAccepted** | **Boolean** | A flag indicating that receiving marketing information has been accepted. |  [optional]
**phoneNumber** | **String** | Phone number. |  [optional]
**email** | **String** | The email address. | 
**status** | [**StatusEnum**](#StatusEnum) | The status of the user. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. | 
**accountId** | **String** | The UUID of the account. | 
**totpScratchCodes** | **List&lt;String&gt;** | A list of scratch codes for the 2-factor authentication. Visible only when 2FA is requested to be enabled or the codes regenerated. |  [optional]
**object** | [**ObjectEnum**](#ObjectEnum) | Entity name: always &#39;user&#39; | 
**groups** | **List&lt;String&gt;** | A list of IDs of the groups this user belongs to. |  [optional]
**address** | **String** | Address. |  [optional]
**password** | **String** | The password when creating a new user. It will will generated when not present in the request. |  [optional]
**emailVerified** | **Boolean** | A flag indicating whether the user&#39;s email address has been verified or not. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Creation UTC time RFC3339. |  [optional]
**isTotpEnabled** | **Boolean** | A flag indicating whether 2-factor authentication (TOTP) has been enabled. |  [optional]
**passwordChangedTime** | **Long** | A timestamp of the latest change of the user password, in milliseconds. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ENROLLING | &quot;ENROLLING&quot;
INVITED | &quot;INVITED&quot;
ACTIVE | &quot;ACTIVE&quot;
RESET | &quot;RESET&quot;
INACTIVE | &quot;INACTIVE&quot;


<a name="ObjectEnum"></a>
## Enum: ObjectEnum
Name | Value
---- | -----
USER | &quot;user&quot;
API_KEY | &quot;api-key&quot;
GROUP | &quot;group&quot;
ACCOUNT | &quot;account&quot;
ACCOUNT_TEMPLATE | &quot;account-template&quot;
TRUSTED_CERT | &quot;trusted-cert&quot;
LIST | &quot;list&quot;
ERROR | &quot;error&quot;


