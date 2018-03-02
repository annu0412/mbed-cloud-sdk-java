/*
 * Enrollment API
 * Mbed Cloud Connect Enrollment Service allows users to claim the ownership of a device which is not yet assigned to an account. A device without an assigned account can be a device purchased from the open market (OEM dealer) or a device trasferred from an account to another. More information in [Device overship: First-to-claim](TODO: link needed) document. 
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
import java.io.Serializable;

/**
 * EnrollmentId
 */

public class EnrollmentId implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("enrollment_identity")
  private String enrollmentIdentity = null;

  public EnrollmentId enrollmentIdentity(String enrollmentIdentity) {
    this.enrollmentIdentity = enrollmentIdentity;
    return this;
  }

   /**
   * Enrollment identity.
   * @return enrollmentIdentity
  **/
  @ApiModelProperty(example = "A-35:e7:72:8a:07:50:3b:3d:75:96:57:52:72:41:0d:78:cc:c6:e5:53:48:c6:65:58:5b:fa:af:4d:2d:73:95:c5", value = "Enrollment identity.")
  public String getEnrollmentIdentity() {
    return enrollmentIdentity;
  }

  public void setEnrollmentIdentity(String enrollmentIdentity) {
    this.enrollmentIdentity = enrollmentIdentity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrollmentId enrollmentId = (EnrollmentId) o;
    return Objects.equals(this.enrollmentIdentity, enrollmentId.enrollmentIdentity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentIdentity);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrollmentId {\n");
    
    sb.append("    enrollmentIdentity: ").append(toIndentedString(enrollmentIdentity)).append("\n");
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

