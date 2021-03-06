/*
 * Update Service API
 * This is the API documentation for the Mbed deployment service, which is part of the update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.updateservice.model;

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
 * FirmwareManifest
 */

public class FirmwareManifest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("datafile")
  private String datafile = null;

  @SerializedName("datafile_size")
  private Long datafileSize = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("device_class")
  private String deviceClass = null;

  @SerializedName("etag")
  private DateTime etag = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("key_table")
  private String keyTable = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("timestamp")
  private DateTime timestamp = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public FirmwareManifest createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time the object was created
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time the object was created")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public FirmwareManifest datafile(String datafile) {
    this.datafile = datafile;
    return this;
  }

   /**
   * The URL of the firmware manifest binary
   * @return datafile
  **/
  @ApiModelProperty(example = "http://example.com/00000000000000000000000000000000", required = true, value = "The URL of the firmware manifest binary")
  public String getDatafile() {
    return datafile;
  }

  public void setDatafile(String datafile) {
    this.datafile = datafile;
  }

  public FirmwareManifest datafileSize(Long datafileSize) {
    this.datafileSize = datafileSize;
    return this;
  }

   /**
   * Size of the datafile in bytes
   * @return datafileSize
  **/
  @ApiModelProperty(value = "Size of the datafile in bytes")
  public Long getDatafileSize() {
    return datafileSize;
  }

  public void setDatafileSize(Long datafileSize) {
    this.datafileSize = datafileSize;
  }

  public FirmwareManifest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the firmware manifest
   * @return description
  **/
  @ApiModelProperty(example = "", required = true, value = "The description of the firmware manifest")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FirmwareManifest deviceClass(String deviceClass) {
    this.deviceClass = deviceClass;
    return this;
  }

   /**
   * The class of the device
   * @return deviceClass
  **/
  @ApiModelProperty(example = "00000000-0000-0000-0000-000000000000", required = true, value = "The class of the device")
  public String getDeviceClass() {
    return deviceClass;
  }

  public void setDeviceClass(String deviceClass) {
    this.deviceClass = deviceClass;
  }

  public FirmwareManifest etag(DateTime etag) {
    this.etag = etag;
    return this;
  }

   /**
   * The entity instance signature
   * @return etag
  **/
  @ApiModelProperty(required = true, value = "The entity instance signature")
  public DateTime getEtag() {
    return etag;
  }

  public void setEtag(DateTime etag) {
    this.etag = etag;
  }

  public FirmwareManifest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The firmware manifest ID
   * @return id
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000", required = true, value = "The firmware manifest ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FirmwareManifest keyTable(String keyTable) {
    this.keyTable = keyTable;
    return this;
  }

   /**
   * The key table of pre-shared keys for devices
   * @return keyTable
  **/
  @ApiModelProperty(example = "http://example.com", value = "The key table of pre-shared keys for devices")
  public String getKeyTable() {
    return keyTable;
  }

  public void setKeyTable(String keyTable) {
    this.keyTable = keyTable;
  }

  public FirmwareManifest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the object
   * @return name
  **/
  @ApiModelProperty(example = "", required = true, value = "The name of the object")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FirmwareManifest object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity
   * @return object
  **/
  @ApiModelProperty(example = "firmware-manifest", required = true, value = "The API resource entity")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public FirmwareManifest timestamp(DateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * The firmware manifest version as a timestamp
   * @return timestamp
  **/
  @ApiModelProperty(required = true, value = "The firmware manifest version as a timestamp")
  public DateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(DateTime timestamp) {
    this.timestamp = timestamp;
  }

  public FirmwareManifest updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The time the object was updated
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "The time the object was updated")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareManifest firmwareManifest = (FirmwareManifest) o;
    return Objects.equals(this.createdAt, firmwareManifest.createdAt) &&
        Objects.equals(this.datafile, firmwareManifest.datafile) &&
        Objects.equals(this.datafileSize, firmwareManifest.datafileSize) &&
        Objects.equals(this.description, firmwareManifest.description) &&
        Objects.equals(this.deviceClass, firmwareManifest.deviceClass) &&
        Objects.equals(this.etag, firmwareManifest.etag) &&
        Objects.equals(this.id, firmwareManifest.id) &&
        Objects.equals(this.keyTable, firmwareManifest.keyTable) &&
        Objects.equals(this.name, firmwareManifest.name) &&
        Objects.equals(this.object, firmwareManifest.object) &&
        Objects.equals(this.timestamp, firmwareManifest.timestamp) &&
        Objects.equals(this.updatedAt, firmwareManifest.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, datafile, datafileSize, description, deviceClass, etag, id, keyTable, name, object, timestamp, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareManifest {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datafile: ").append(toIndentedString(datafile)).append("\n");
    sb.append("    datafileSize: ").append(toIndentedString(datafileSize)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    keyTable: ").append(toIndentedString(keyTable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

