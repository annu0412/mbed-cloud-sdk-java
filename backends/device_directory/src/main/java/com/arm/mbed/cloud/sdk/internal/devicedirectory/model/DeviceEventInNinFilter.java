/*
 * Device Directory API
 * This is the API Documentation for the Mbed Device Directory service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.devicedirectory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * DeviceEventInNinFilter
 */

public class DeviceEventInNinFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("date_time")
  private DateTime dateTime = null;

  @SerializedName("state_change")
  private Boolean stateChange = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("device_id")
  private String deviceId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("event_type")
  private String eventType = null;

  public DeviceEventInNinFilter dateTime(DateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * Get dateTime
   * @return dateTime
  **/
  @ApiModelProperty(value = "")
  public DateTime getDateTime() {
    return dateTime;
  }

  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  public DeviceEventInNinFilter stateChange(Boolean stateChange) {
    this.stateChange = stateChange;
    return this;
  }

   /**
   * Get stateChange
   * @return stateChange
  **/
  @ApiModelProperty(value = "")
  public Boolean isStateChange() {
    return stateChange;
  }

  public void setStateChange(Boolean stateChange) {
    this.stateChange = stateChange;
  }

  public DeviceEventInNinFilter description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeviceEventInNinFilter deviceId(String deviceId) {
    this.deviceId = deviceId;
    return this;
  }

   /**
   * Get deviceId
   * @return deviceId
  **/
  @ApiModelProperty(value = "")
  public String getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(String deviceId) {
    this.deviceId = deviceId;
  }

  public DeviceEventInNinFilter id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DeviceEventInNinFilter eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Get eventType
   * @return eventType
  **/
  @ApiModelProperty(value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEventInNinFilter deviceEventInNinFilter = (DeviceEventInNinFilter) o;
    return Objects.equals(this.dateTime, deviceEventInNinFilter.dateTime) &&
        Objects.equals(this.stateChange, deviceEventInNinFilter.stateChange) &&
        Objects.equals(this.description, deviceEventInNinFilter.description) &&
        Objects.equals(this.deviceId, deviceEventInNinFilter.deviceId) &&
        Objects.equals(this.id, deviceEventInNinFilter.id) &&
        Objects.equals(this.eventType, deviceEventInNinFilter.eventType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateTime, stateChange, description, deviceId, id, eventType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEventInNinFilter {\n");
    
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    stateChange: ").append(toIndentedString(stateChange)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
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

