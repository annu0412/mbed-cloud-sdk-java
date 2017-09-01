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
import com.arm.mbed.cloud.sdk.internal.updateservice.model.FirmwareImage;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * FirmwareImagePage
 */

public class FirmwareImagePage implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("object")
  private String object = null;

  @SerializedName("has_more")
  private Boolean hasMore = null;

  @SerializedName("total_count")
  private Integer totalCount = null;

  @SerializedName("after")
  private String after = null;

  @SerializedName("limit")
  private Integer limit = null;

  @SerializedName("data")
  private List<FirmwareImage> data = new ArrayList<FirmwareImage>();

  /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   */
  public enum OrderEnum {
    @SerializedName("ASC")
    ASC("ASC"),
    
    @SerializedName("DESC")
    DESC("DESC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("order")
  private OrderEnum order = null;

  public FirmwareImagePage object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public FirmwareImagePage hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public FirmwareImagePage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public FirmwareImagePage after(String after) {
    this.after = after;
    return this;
  }

   /**
   * Get after
   * @return after
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }

  public FirmwareImagePage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public FirmwareImagePage data(List<FirmwareImage> data) {
    this.data = data;
    return this;
  }

  public FirmwareImagePage addDataItem(FirmwareImage dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FirmwareImage> getData() {
    return data;
  }

  public void setData(List<FirmwareImage> data) {
    this.data = data;
  }

  public FirmwareImagePage order(OrderEnum order) {
    this.order = order;
    return this;
  }

   /**
   * The order of the records to return. Acceptable values: ASC, DESC. Default: ASC
   * @return order
  **/
  @ApiModelProperty(example = "ASC", value = "The order of the records to return. Acceptable values: ASC, DESC. Default: ASC")
  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FirmwareImagePage firmwareImagePage = (FirmwareImagePage) o;
    return Objects.equals(this.object, firmwareImagePage.object) &&
        Objects.equals(this.hasMore, firmwareImagePage.hasMore) &&
        Objects.equals(this.totalCount, firmwareImagePage.totalCount) &&
        Objects.equals(this.after, firmwareImagePage.after) &&
        Objects.equals(this.limit, firmwareImagePage.limit) &&
        Objects.equals(this.data, firmwareImagePage.data) &&
        Objects.equals(this.order, firmwareImagePage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, hasMore, totalCount, after, limit, data, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FirmwareImagePage {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

