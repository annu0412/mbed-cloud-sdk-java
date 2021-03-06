/*
 * Account Management API
 * API for managing accounts, users, creating API keys, uploading trusted certificates
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.iam.model;

import java.util.Objects;
import com.arm.mbed.cloud.sdk.internal.iam.model.LoginHistory;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * This object represents a user in mbed Cloud.
 */
@ApiModel(description = "This object represents a user in mbed Cloud.")

public class UserInfoResp implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("creation_time")
  private Long creationTime = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("email_verified")
  private Boolean emailVerified = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("full_name")
  private String fullName = null;

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("is_gtc_accepted")
  private Boolean isGtcAccepted = null;

  @SerializedName("is_marketing_accepted")
  private Boolean isMarketingAccepted = null;

  @SerializedName("is_totp_enabled")
  private Boolean isTotpEnabled = null;

  @SerializedName("last_login_time")
  private Long lastLoginTime = null;

  @SerializedName("login_history")
  private List<LoginHistory> loginHistory = null;

  /**
   * Entity name: always &#39;user&#39;
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    USER("user");

    private String value;

    ObjectEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ObjectEnum fromValue(String text) {
      for (ObjectEnum b : ObjectEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ObjectEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ObjectEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ObjectEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ObjectEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("object")
  private ObjectEnum object = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("password_changed_time")
  private Long passwordChangedTime = null;

  @SerializedName("phone_number")
  private String phoneNumber = null;

  /**
   * The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENROLLING("ENROLLING"),
    
    INVITED("INVITED"),
    
    ACTIVE("ACTIVE"),
    
    RESET("RESET"),
    
    INACTIVE("INACTIVE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  @SerializedName("username")
  private String username = null;

  public UserInfoResp accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The UUID of the account.
   * @return accountId
  **/
  @ApiModelProperty(example = "01619571e2e90242ac12000600000000", required = true, value = "The UUID of the account.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public UserInfoResp address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Address.
   * @return address
  **/
  @ApiModelProperty(example = "110 Fulbourn Rd, Cambridge, United Kingdom", value = "Address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public UserInfoResp createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Creation UTC time RFC3339.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2018-02-13T09:35:20Z", value = "Creation UTC time RFC3339.")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UserInfoResp creationTime(Long creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * A timestamp of the user creation in the storage, in milliseconds.
   * @return creationTime
  **/
  @ApiModelProperty(example = "1518630727683", value = "A timestamp of the user creation in the storage, in milliseconds.")
  public Long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Long creationTime) {
    this.creationTime = creationTime;
  }

  public UserInfoResp email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address.
   * @return email
  **/
  @ApiModelProperty(example = "user@arm.com", required = true, value = "The email address.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserInfoResp emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }

   /**
   * A flag indicating whether the user&#39;s email address has been verified or not.
   * @return emailVerified
  **/
  @ApiModelProperty(example = "true", value = "A flag indicating whether the user's email address has been verified or not.")
  public Boolean isEmailVerified() {
    return emailVerified;
  }

  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  public UserInfoResp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * API resource entity version.
   * @return etag
  **/
  @ApiModelProperty(example = "1", required = true, value = "API resource entity version.")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public UserInfoResp fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * The full name of the user.
   * @return fullName
  **/
  @ApiModelProperty(example = "User Doe", value = "The full name of the user.")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public UserInfoResp groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserInfoResp addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * A list of IDs of the groups this user belongs to.
   * @return groups
  **/
  @ApiModelProperty(value = "A list of IDs of the groups this user belongs to.")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public UserInfoResp id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The UUID of the user.
   * @return id
  **/
  @ApiModelProperty(example = "01619571e2e89242ac12000600000000", required = true, value = "The UUID of the user.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserInfoResp isGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
    return this;
  }

   /**
   * A flag indicating that the General Terms and Conditions has been accepted.
   * @return isGtcAccepted
  **/
  @ApiModelProperty(example = "true", value = "A flag indicating that the General Terms and Conditions has been accepted.")
  public Boolean isIsGtcAccepted() {
    return isGtcAccepted;
  }

  public void setIsGtcAccepted(Boolean isGtcAccepted) {
    this.isGtcAccepted = isGtcAccepted;
  }

  public UserInfoResp isMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
    return this;
  }

   /**
   * A flag indicating that receiving marketing information has been accepted.
   * @return isMarketingAccepted
  **/
  @ApiModelProperty(example = "true", value = "A flag indicating that receiving marketing information has been accepted.")
  public Boolean isIsMarketingAccepted() {
    return isMarketingAccepted;
  }

  public void setIsMarketingAccepted(Boolean isMarketingAccepted) {
    this.isMarketingAccepted = isMarketingAccepted;
  }

  public UserInfoResp isTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
    return this;
  }

   /**
   * A flag indicating whether 2-factor authentication (TOTP) has been enabled.
   * @return isTotpEnabled
  **/
  @ApiModelProperty(example = "true", value = "A flag indicating whether 2-factor authentication (TOTP) has been enabled.")
  public Boolean isIsTotpEnabled() {
    return isTotpEnabled;
  }

  public void setIsTotpEnabled(Boolean isTotpEnabled) {
    this.isTotpEnabled = isTotpEnabled;
  }

  public UserInfoResp lastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
    return this;
  }

   /**
   * A timestamp of the latest login of the user, in milliseconds.
   * @return lastLoginTime
  **/
  @ApiModelProperty(example = "1518630727688", value = "A timestamp of the latest login of the user, in milliseconds.")
  public Long getLastLoginTime() {
    return lastLoginTime;
  }

  public void setLastLoginTime(Long lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public UserInfoResp loginHistory(List<LoginHistory> loginHistory) {
    this.loginHistory = loginHistory;
    return this;
  }

  public UserInfoResp addLoginHistoryItem(LoginHistory loginHistoryItem) {
    if (this.loginHistory == null) {
      this.loginHistory = new ArrayList<LoginHistory>();
    }
    this.loginHistory.add(loginHistoryItem);
    return this;
  }

   /**
   * Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format.
   * @return loginHistory
  **/
  @ApiModelProperty(value = "Timestamps, succeedings, IP addresses and user agent information of the last five logins of the user, with timestamps in RFC3339 format.")
  public List<LoginHistory> getLoginHistory() {
    return loginHistory;
  }

  public void setLoginHistory(List<LoginHistory> loginHistory) {
    this.loginHistory = loginHistory;
  }

  public UserInfoResp object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Entity name: always &#39;user&#39;
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Entity name: always 'user'")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public UserInfoResp password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password when creating a new user. It will be generated when not present in the request.
   * @return password
  **/
  @ApiModelProperty(example = "PZf9eEUH43DAPE9ULINFeuj", value = "The password when creating a new user. It will be generated when not present in the request.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UserInfoResp passwordChangedTime(Long passwordChangedTime) {
    this.passwordChangedTime = passwordChangedTime;
    return this;
  }

   /**
   * A timestamp of the latest change of the user password, in milliseconds.
   * @return passwordChangedTime
  **/
  @ApiModelProperty(example = "1518630727688", value = "A timestamp of the latest change of the user password, in milliseconds.")
  public Long getPasswordChangedTime() {
    return passwordChangedTime;
  }

  public void setPasswordChangedTime(Long passwordChangedTime) {
    this.passwordChangedTime = passwordChangedTime;
  }

  public UserInfoResp phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Phone number.
   * @return phoneNumber
  **/
  @ApiModelProperty(example = "+44 (1223) 400 400", value = "Phone number.")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public UserInfoResp status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.
   * @return status
  **/
  @ApiModelProperty(example = "ACTIVE", required = true, value = "The status of the user. ENROLLING state indicates that the user is in the middle of the enrollment process. INVITED means that the user has not accepted the invitation request. RESET means that the password must be changed immediately. INACTIVE users are locked out and not permitted to use the system.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public UserInfoResp updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Last update UTC time RFC3339.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2018-02-14T15:24:14Z", value = "Last update UTC time RFC3339.")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UserInfoResp username(String username) {
    this.username = username;
    return this;
  }

   /**
   * A username containing alphanumerical letters and -,._@+&#x3D; characters.
   * @return username
  **/
  @ApiModelProperty(example = "admin", value = "A username containing alphanumerical letters and -,._@+= characters.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfoResp userInfoResp = (UserInfoResp) o;
    return Objects.equals(this.accountId, userInfoResp.accountId) &&
        Objects.equals(this.address, userInfoResp.address) &&
        Objects.equals(this.createdAt, userInfoResp.createdAt) &&
        Objects.equals(this.creationTime, userInfoResp.creationTime) &&
        Objects.equals(this.email, userInfoResp.email) &&
        Objects.equals(this.emailVerified, userInfoResp.emailVerified) &&
        Objects.equals(this.etag, userInfoResp.etag) &&
        Objects.equals(this.fullName, userInfoResp.fullName) &&
        Objects.equals(this.groups, userInfoResp.groups) &&
        Objects.equals(this.id, userInfoResp.id) &&
        Objects.equals(this.isGtcAccepted, userInfoResp.isGtcAccepted) &&
        Objects.equals(this.isMarketingAccepted, userInfoResp.isMarketingAccepted) &&
        Objects.equals(this.isTotpEnabled, userInfoResp.isTotpEnabled) &&
        Objects.equals(this.lastLoginTime, userInfoResp.lastLoginTime) &&
        Objects.equals(this.loginHistory, userInfoResp.loginHistory) &&
        Objects.equals(this.object, userInfoResp.object) &&
        Objects.equals(this.password, userInfoResp.password) &&
        Objects.equals(this.passwordChangedTime, userInfoResp.passwordChangedTime) &&
        Objects.equals(this.phoneNumber, userInfoResp.phoneNumber) &&
        Objects.equals(this.status, userInfoResp.status) &&
        Objects.equals(this.updatedAt, userInfoResp.updatedAt) &&
        Objects.equals(this.username, userInfoResp.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, address, createdAt, creationTime, email, emailVerified, etag, fullName, groups, id, isGtcAccepted, isMarketingAccepted, isTotpEnabled, lastLoginTime, loginHistory, object, password, passwordChangedTime, phoneNumber, status, updatedAt, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfoResp {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isGtcAccepted: ").append(toIndentedString(isGtcAccepted)).append("\n");
    sb.append("    isMarketingAccepted: ").append(toIndentedString(isMarketingAccepted)).append("\n");
    sb.append("    isTotpEnabled: ").append(toIndentedString(isTotpEnabled)).append("\n");
    sb.append("    lastLoginTime: ").append(toIndentedString(lastLoginTime)).append("\n");
    sb.append("    loginHistory: ").append(toIndentedString(loginHistory)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordChangedTime: ").append(toIndentedString(passwordChangedTime)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

