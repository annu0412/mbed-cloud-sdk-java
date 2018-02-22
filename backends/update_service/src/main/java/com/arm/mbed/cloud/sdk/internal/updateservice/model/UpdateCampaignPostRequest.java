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
 * UpdateCampaignPostRequest
 */

public class UpdateCampaignPostRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("description")
  private String description = null;

  @SerializedName("root_manifest_id")
  private String rootManifestId = null;

  @SerializedName("object")
  private String object = null;

  @SerializedName("when")
  private DateTime when = null;

  /**
   * The state of the campaign
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    DRAFT("draft"),
    
    SCHEDULED("scheduled"),
    
    ALLOCATINGQUOTA("allocatingquota"),
    
    ALLOCATEDQUOTA("allocatedquota"),
    
    INSUFFICIENTQUOTA("insufficientquota"),
    
    CHECKINGMANIFEST("checkingmanifest"),
    
    CHECKEDMANIFEST("checkedmanifest"),
    
    DEVICEFETCH("devicefetch"),
    
    DEVICECOPY("devicecopy"),
    
    DEVICECHECK("devicecheck"),
    
    PUBLISHING("publishing"),
    
    DEPLOYING("deploying"),
    
    DEPLOYED("deployed"),
    
    MANIFESTREMOVED("manifestremoved"),
    
    EXPIRED("expired"),
    
    STOPPING("stopping"),
    
    AUTOSTOPPED("autostopped"),
    
    USERSTOPPED("userstopped"),
    
    CONFLICT("conflict");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("device_filter")
  private String deviceFilter = null;

  @SerializedName("name")
  private String name = null;

  public UpdateCampaignPostRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The optional description of the campaign
   * @return description
  **/
  @ApiModelProperty(example = "", value = "The optional description of the campaign")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateCampaignPostRequest rootManifestId(String rootManifestId) {
    this.rootManifestId = rootManifestId;
    return this;
  }

   /**
   * Get rootManifestId
   * @return rootManifestId
  **/
  @ApiModelProperty(example = "00000000000000000000000000000000", value = "")
  public String getRootManifestId() {
    return rootManifestId;
  }

  public void setRootManifestId(String rootManifestId) {
    this.rootManifestId = rootManifestId;
  }

  public UpdateCampaignPostRequest object(String object) {
    this.object = object;
    return this;
  }

   /**
   * The API resource entity
   * @return object
  **/
  @ApiModelProperty(example = "update-campaign", value = "The API resource entity")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public UpdateCampaignPostRequest when(DateTime when) {
    this.when = when;
    return this;
  }

   /**
   * The scheduled start time for the update campaign
   * @return when
  **/
  @ApiModelProperty(value = "The scheduled start time for the update campaign")
  public DateTime getWhen() {
    return when;
  }

  public void setWhen(DateTime when) {
    this.when = when;
  }

  public UpdateCampaignPostRequest state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of the campaign
   * @return state
  **/
  @ApiModelProperty(value = "The state of the campaign")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public UpdateCampaignPostRequest deviceFilter(String deviceFilter) {
    this.deviceFilter = deviceFilter;
    return this;
  }

   /**
   * The filter for the devices the campaign will target
   * @return deviceFilter
  **/
  @ApiModelProperty(example = "id__eq=00000000000000000000000000000000", required = true, value = "The filter for the devices the campaign will target")
  public String getDeviceFilter() {
    return deviceFilter;
  }

  public void setDeviceFilter(String deviceFilter) {
    this.deviceFilter = deviceFilter;
  }

  public UpdateCampaignPostRequest name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name for this campaign
   * @return name
  **/
  @ApiModelProperty(example = "campaign", required = true, value = "The name for this campaign")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCampaignPostRequest updateCampaignPostRequest = (UpdateCampaignPostRequest) o;
    return Objects.equals(this.description, updateCampaignPostRequest.description) &&
        Objects.equals(this.rootManifestId, updateCampaignPostRequest.rootManifestId) &&
        Objects.equals(this.object, updateCampaignPostRequest.object) &&
        Objects.equals(this.when, updateCampaignPostRequest.when) &&
        Objects.equals(this.state, updateCampaignPostRequest.state) &&
        Objects.equals(this.deviceFilter, updateCampaignPostRequest.deviceFilter) &&
        Objects.equals(this.name, updateCampaignPostRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, rootManifestId, object, when, state, deviceFilter, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignPostRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rootManifestId: ").append(toIndentedString(rootManifestId)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    deviceFilter: ").append(toIndentedString(deviceFilter)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

