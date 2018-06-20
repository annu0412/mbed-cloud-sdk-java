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
import com.arm.mbed.cloud.sdk.internal.billing.model.ReportAccountContactInfo;
import com.arm.mbed.cloud.sdk.internal.billing.model.ReportBillingData;
import com.arm.mbed.cloud.sdk.internal.billing.model.ServicePackageReport;
import com.arm.mbed.cloud.sdk.internal.billing.model.SubtenantAccountReport;
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
import java.io.Serializable;

/**
 * Billing report response.
 */
@ApiModel(description = "Billing report response.")

public class ReportResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account")
  private ReportAccountContactInfo account = null;

  @SerializedName("aggregated")
  private ReportBillingData aggregated = null;

  @SerializedName("billing_data")
  private ReportBillingData billingData = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("month")
  private String month = null;

  /**
   * Billing report response object. Always set to &#39;billing-report&#39;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    REPORT("billing-report");

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

  @SerializedName("service_package")
  private ServicePackageReport servicePackage = null;

  @SerializedName("subtenants")
  private List<SubtenantAccountReport> subtenants = new ArrayList<SubtenantAccountReport>();

  public ReportResponse account(ReportAccountContactInfo account) {
    this.account = account;
    return this;
  }

   /**
   * Account contact information.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "Account contact information.")
  public ReportAccountContactInfo getAccount() {
    return account;
  }

  public void setAccount(ReportAccountContactInfo account) {
    this.account = account;
  }

  public ReportResponse aggregated(ReportBillingData aggregated) {
    this.aggregated = aggregated;
    return this;
  }

   /**
   * Aggregated report billing data including all subtenant accounts if any.
   * @return aggregated
  **/
  @ApiModelProperty(required = true, value = "Aggregated report billing data including all subtenant accounts if any.")
  public ReportBillingData getAggregated() {
    return aggregated;
  }

  public void setAggregated(ReportBillingData aggregated) {
    this.aggregated = aggregated;
  }

  public ReportResponse billingData(ReportBillingData billingData) {
    this.billingData = billingData;
    return this;
  }

   /**
   * Report billing data.
   * @return billingData
  **/
  @ApiModelProperty(required = true, value = "Report billing data.")
  public ReportBillingData getBillingData() {
    return billingData;
  }

  public void setBillingData(ReportBillingData billingData) {
    this.billingData = billingData;
  }

  public ReportResponse id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Billing report id.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Billing report id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ReportResponse month(String month) {
    this.month = month;
    return this;
  }

   /**
   * Month of requested billing report
   * @return month
  **/
  @ApiModelProperty(required = true, value = "Month of requested billing report")
  public String getMonth() {
    return month;
  }

  public void setMonth(String month) {
    this.month = month;
  }

  public ReportResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Billing report response object. Always set to &#39;billing-report&#39;.
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Billing report response object. Always set to 'billing-report'.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ReportResponse servicePackage(ServicePackageReport servicePackage) {
    this.servicePackage = servicePackage;
    return this;
  }

   /**
   * Report service package.
   * @return servicePackage
  **/
  @ApiModelProperty(value = "Report service package.")
  public ServicePackageReport getServicePackage() {
    return servicePackage;
  }

  public void setServicePackage(ServicePackageReport servicePackage) {
    this.servicePackage = servicePackage;
  }

  public ReportResponse subtenants(List<SubtenantAccountReport> subtenants) {
    this.subtenants = subtenants;
    return this;
  }

  public ReportResponse addSubtenantsItem(SubtenantAccountReport subtenantsItem) {
    this.subtenants.add(subtenantsItem);
    return this;
  }

   /**
   * List of billing reports for subtenant accounts. Empty list if account does not have any subtenant account.
   * @return subtenants
  **/
  @ApiModelProperty(required = true, value = "List of billing reports for subtenant accounts. Empty list if account does not have any subtenant account.")
  public List<SubtenantAccountReport> getSubtenants() {
    return subtenants;
  }

  public void setSubtenants(List<SubtenantAccountReport> subtenants) {
    this.subtenants = subtenants;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportResponse reportResponse = (ReportResponse) o;
    return Objects.equals(this.account, reportResponse.account) &&
        Objects.equals(this.aggregated, reportResponse.aggregated) &&
        Objects.equals(this.billingData, reportResponse.billingData) &&
        Objects.equals(this.id, reportResponse.id) &&
        Objects.equals(this.month, reportResponse.month) &&
        Objects.equals(this.object, reportResponse.object) &&
        Objects.equals(this.servicePackage, reportResponse.servicePackage) &&
        Objects.equals(this.subtenants, reportResponse.subtenants);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, aggregated, billingData, id, month, object, servicePackage, subtenants);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportResponse {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    aggregated: ").append(toIndentedString(aggregated)).append("\n");
    sb.append("    billingData: ").append(toIndentedString(billingData)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    servicePackage: ").append(toIndentedString(servicePackage)).append("\n");
    sb.append("    subtenants: ").append(toIndentedString(subtenants)).append("\n");
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

