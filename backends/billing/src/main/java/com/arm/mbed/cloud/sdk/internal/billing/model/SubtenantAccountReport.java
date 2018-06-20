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
import com.arm.mbed.cloud.sdk.internal.billing.model.ReportBillingData;
import com.arm.mbed.cloud.sdk.internal.billing.model.SubtenantReportAccountContactInfo;
import com.arm.mbed.cloud.sdk.internal.billing.model.SubtenantServicePackageReport;
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
 * Billing report for subtenant account.
 */
@ApiModel(description = "Billing report for subtenant account.")

public class SubtenantAccountReport implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("account")
  private SubtenantReportAccountContactInfo account = null;

  @SerializedName("billing_data")
  private ReportBillingData billingData = null;

  @SerializedName("service_package")
  private SubtenantServicePackageReport servicePackage = null;

  public SubtenantAccountReport account(SubtenantReportAccountContactInfo account) {
    this.account = account;
    return this;
  }

   /**
   * Subtenant account contact information.
   * @return account
  **/
  @ApiModelProperty(required = true, value = "Subtenant account contact information.")
  public SubtenantReportAccountContactInfo getAccount() {
    return account;
  }

  public void setAccount(SubtenantReportAccountContactInfo account) {
    this.account = account;
  }

  public SubtenantAccountReport billingData(ReportBillingData billingData) {
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

  public SubtenantAccountReport servicePackage(SubtenantServicePackageReport servicePackage) {
    this.servicePackage = servicePackage;
    return this;
  }

   /**
   * Report service package for subtenant account.
   * @return servicePackage
  **/
  @ApiModelProperty(value = "Report service package for subtenant account.")
  public SubtenantServicePackageReport getServicePackage() {
    return servicePackage;
  }

  public void setServicePackage(SubtenantServicePackageReport servicePackage) {
    this.servicePackage = servicePackage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtenantAccountReport subtenantAccountReport = (SubtenantAccountReport) o;
    return Objects.equals(this.account, subtenantAccountReport.account) &&
        Objects.equals(this.billingData, subtenantAccountReport.billingData) &&
        Objects.equals(this.servicePackage, subtenantAccountReport.servicePackage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, billingData, servicePackage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubtenantAccountReport {\n");
    
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    billingData: ").append(toIndentedString(billingData)).append("\n");
    sb.append("    servicePackage: ").append(toIndentedString(servicePackage)).append("\n");
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

