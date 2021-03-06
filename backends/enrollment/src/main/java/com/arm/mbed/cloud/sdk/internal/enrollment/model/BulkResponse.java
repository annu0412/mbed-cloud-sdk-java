/*
 * Enrollment API
 * Mbed Cloud Connect Enrollment Service allows users to claim the ownership of a device which is not yet assigned to an account. A device without an assigned account can be a device purchased from the open market (OEM dealer) or a device transferred from an account to another. More information in [Device ownership: First-to-claim](https://cloud.mbed.com/docs/current/connecting/device-ownership.html) document. 
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.enrollment.model;

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
 * BulkResponse
 */

public class BulkResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account_id")
  private String accountId = null;

  @SerializedName("completed_at")
  private DateTime completedAt = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("errors_count")
  private Integer errorsCount = null;

  @SerializedName("errors_report_file")
  private String errorsReportFile = null;

  @SerializedName("etag")
  private String etag = null;

  @SerializedName("full_report_file")
  private String fullReportFile = null;

  @SerializedName("id")
  private String id = null;

  /**
   * Gets or Sets object
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    UPLOADS("enrollment-identity-bulk-uploads");

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

  @SerializedName("processed_count")
  private Integer processedCount = null;

  /**
   * The state of the process is &#39;new&#39; at the time of creation. If the creation is still in progress, the state is shown as &#39;processing&#39;. When the request has been fully processed, the state changes to &#39;completed&#39;. 
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NEW("new"),
    
    PROCESSING("processing"),
    
    COMPLETED("completed");

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
  private StatusEnum status = StatusEnum.NEW;

  @SerializedName("total_count")
  private Integer totalCount = null;

  public BulkResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * ID
   * @return accountId
  **/
  @ApiModelProperty(example = "00005a4e027f0a580a01081c00000000", required = true, value = "ID")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BulkResponse completedAt(DateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

   /**
   * The time of completing the bulk creation task. 
   * @return completedAt
  **/
  @ApiModelProperty(value = "The time of completing the bulk creation task. ")
  public DateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(DateTime completedAt) {
    this.completedAt = completedAt;
  }

  public BulkResponse createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time of receiving the bulk creation task. 
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "The time of receiving the bulk creation task. ")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BulkResponse errorsCount(Integer errorsCount) {
    this.errorsCount = errorsCount;
    return this;
  }

   /**
   * The number of enrollment identities with failed processing. 
   * @return errorsCount
  **/
  @ApiModelProperty(example = "0", required = true, value = "The number of enrollment identities with failed processing. ")
  public Integer getErrorsCount() {
    return errorsCount;
  }

  public void setErrorsCount(Integer errorsCount) {
    this.errorsCount = errorsCount;
  }

  public BulkResponse errorsReportFile(String errorsReportFile) {
    this.errorsReportFile = errorsReportFile;
    return this;
  }

   /**
   * Get errorsReportFile
   * @return errorsReportFile
  **/
  @ApiModelProperty(example = "https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads/2d238a89038b4ddb84699dd36a901063/errors_report.csv", value = "")
  public String getErrorsReportFile() {
    return errorsReportFile;
  }

  public void setErrorsReportFile(String errorsReportFile) {
    this.errorsReportFile = errorsReportFile;
  }

  public BulkResponse etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * etag
   * @return etag
  **/
  @ApiModelProperty(example = "1", required = true, value = "etag")
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public BulkResponse fullReportFile(String fullReportFile) {
    this.fullReportFile = fullReportFile;
    return this;
  }

   /**
   * Get fullReportFile
   * @return fullReportFile
  **/
  @ApiModelProperty(example = "https://api.us-east-1.mbedcloud.com/v3/device-enrollments-bulk-uploads/2d238a89038b4ddb84699dd36a901063/full_report.csv", value = "")
  public String getFullReportFile() {
    return fullReportFile;
  }

  public void setFullReportFile(String fullReportFile) {
    this.fullReportFile = fullReportFile;
  }

  public BulkResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Bulk ID
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Bulk ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BulkResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "enrollment-identity-bulk-uploads", required = true, value = "")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public BulkResponse processedCount(Integer processedCount) {
    this.processedCount = processedCount;
    return this;
  }

   /**
   * The number of enrollment identities processed until now. 
   * @return processedCount
  **/
  @ApiModelProperty(example = "0", required = true, value = "The number of enrollment identities processed until now. ")
  public Integer getProcessedCount() {
    return processedCount;
  }

  public void setProcessedCount(Integer processedCount) {
    this.processedCount = processedCount;
  }

  public BulkResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * The state of the process is &#39;new&#39; at the time of creation. If the creation is still in progress, the state is shown as &#39;processing&#39;. When the request has been fully processed, the state changes to &#39;completed&#39;. 
   * @return status
  **/
  @ApiModelProperty(example = "new", required = true, value = "The state of the process is 'new' at the time of creation. If the creation is still in progress, the state is shown as 'processing'. When the request has been fully processed, the state changes to 'completed'. ")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BulkResponse totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of enrollment identities found in the input CSV. 
   * @return totalCount
  **/
  @ApiModelProperty(example = "10", required = true, value = "Total number of enrollment identities found in the input CSV. ")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkResponse bulkResponse = (BulkResponse) o;
    return Objects.equals(this.accountId, bulkResponse.accountId) &&
        Objects.equals(this.completedAt, bulkResponse.completedAt) &&
        Objects.equals(this.createdAt, bulkResponse.createdAt) &&
        Objects.equals(this.errorsCount, bulkResponse.errorsCount) &&
        Objects.equals(this.errorsReportFile, bulkResponse.errorsReportFile) &&
        Objects.equals(this.etag, bulkResponse.etag) &&
        Objects.equals(this.fullReportFile, bulkResponse.fullReportFile) &&
        Objects.equals(this.id, bulkResponse.id) &&
        Objects.equals(this.object, bulkResponse.object) &&
        Objects.equals(this.processedCount, bulkResponse.processedCount) &&
        Objects.equals(this.status, bulkResponse.status) &&
        Objects.equals(this.totalCount, bulkResponse.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, completedAt, createdAt, errorsCount, errorsReportFile, etag, fullReportFile, id, object, processedCount, status, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorsCount: ").append(toIndentedString(errorsCount)).append("\n");
    sb.append("    errorsReportFile: ").append(toIndentedString(errorsReportFile)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    fullReportFile: ").append(toIndentedString(fullReportFile)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    processedCount: ").append(toIndentedString(processedCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

