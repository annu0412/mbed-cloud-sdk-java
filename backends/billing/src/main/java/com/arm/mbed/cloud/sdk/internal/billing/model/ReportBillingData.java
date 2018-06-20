/*
 * billing REST API documentation
 * This document contains the public REST API definitions of the mbed-billing service.
 *
 * OpenAPI spec version: 1.4.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.billing.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * ReportBillingData
 */

public class ReportBillingData implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("active_devices")
  private Long activeDevices = null;

  @SerializedName("firmware_updates")
  private Long firmwareUpdates = null;

  @SerializedName("generated")
  private String generated = null;

  @SerializedName("period_end")
  private String periodEnd = null;

  @SerializedName("period_start")
  private String periodStart = null;

  public ReportBillingData activeDevices(Long activeDevices) {
    this.activeDevices = activeDevices;
    return this;
  }

   /**
   * Get activeDevices
   * minimum: 0
   * @return activeDevices
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getActiveDevices() {
    return activeDevices;
  }

  public void setActiveDevices(Long activeDevices) {
    this.activeDevices = activeDevices;
  }

  public ReportBillingData firmwareUpdates(Long firmwareUpdates) {
    this.firmwareUpdates = firmwareUpdates;
    return this;
  }

   /**
   * Get firmwareUpdates
   * minimum: 0
   * @return firmwareUpdates
  **/
  @ApiModelProperty(required = true, value = "")
  public Long getFirmwareUpdates() {
    return firmwareUpdates;
  }

  public void setFirmwareUpdates(Long firmwareUpdates) {
    this.firmwareUpdates = firmwareUpdates;
  }

  public ReportBillingData generated(String generated) {
    this.generated = generated;
    return this;
  }

   /**
   * Get generated
   * @return generated
  **/
  @ApiModelProperty(required = true, value = "")
  public String getGenerated() {
    return generated;
  }

  public void setGenerated(String generated) {
    this.generated = generated;
  }

  public ReportBillingData periodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Get periodEnd
   * @return periodEnd
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPeriodEnd() {
    return periodEnd;
  }

  public void setPeriodEnd(String periodEnd) {
    this.periodEnd = periodEnd;
  }

  public ReportBillingData periodStart(String periodStart) {
    this.periodStart = periodStart;
    return this;
  }

   /**
   * Get periodStart
   * @return periodStart
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPeriodStart() {
    return periodStart;
  }

  public void setPeriodStart(String periodStart) {
    this.periodStart = periodStart;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportBillingData reportBillingData = (ReportBillingData) o;
    return Objects.equals(this.activeDevices, reportBillingData.activeDevices) &&
        Objects.equals(this.firmwareUpdates, reportBillingData.firmwareUpdates) &&
        Objects.equals(this.generated, reportBillingData.generated) &&
        Objects.equals(this.periodEnd, reportBillingData.periodEnd) &&
        Objects.equals(this.periodStart, reportBillingData.periodStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDevices, firmwareUpdates, generated, periodEnd, periodStart);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportBillingData {\n");
    
    sb.append("    activeDevices: ").append(toIndentedString(activeDevices)).append("\n");
    sb.append("    firmwareUpdates: ").append(toIndentedString(firmwareUpdates)).append("\n");
    sb.append("    generated: ").append(toIndentedString(generated)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
    sb.append("    periodStart: ").append(toIndentedString(periodStart)).append("\n");
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

