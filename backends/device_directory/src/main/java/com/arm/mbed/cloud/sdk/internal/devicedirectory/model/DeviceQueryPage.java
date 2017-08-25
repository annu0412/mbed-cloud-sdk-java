/*
 * Device Directory API
 * This is the API Documentation for the mbed device directory update service.
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
import com.arm.mbed.cloud.sdk.internal.devicedirectory.model.DeviceQuery;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * DeviceQueryPage
 */

public class DeviceQueryPage implements Serializable {
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
  private List<DeviceQuery> data = new ArrayList<DeviceQuery>();

  @SerializedName("order")
  private String order = null;

  public DeviceQueryPage object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DeviceQueryPage hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public DeviceQueryPage totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public DeviceQueryPage after(String after) {
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

  public DeviceQueryPage limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public DeviceQueryPage data(List<DeviceQuery> data) {
    this.data = data;
    return this;
  }

  public DeviceQueryPage addDataItem(DeviceQuery dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<DeviceQuery> getData() {
    return data;
  }

  public void setData(List<DeviceQuery> data) {
    this.data = data;
  }

  public DeviceQueryPage order(String order) {
    this.order = order;
    return this;
  }

   /**
   * Get order
   * @return order
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
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
    DeviceQueryPage deviceQueryPage = (DeviceQueryPage) o;
    return Objects.equals(this.object, deviceQueryPage.object) &&
        Objects.equals(this.hasMore, deviceQueryPage.hasMore) &&
        Objects.equals(this.totalCount, deviceQueryPage.totalCount) &&
        Objects.equals(this.after, deviceQueryPage.after) &&
        Objects.equals(this.limit, deviceQueryPage.limit) &&
        Objects.equals(this.data, deviceQueryPage.data) &&
        Objects.equals(this.order, deviceQueryPage.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, hasMore, totalCount, after, limit, data, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceQueryPage {\n");
    
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
