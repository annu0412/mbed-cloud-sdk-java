/*
 * Bootstrap API
 * Mbed Cloud Bootstrap API allows web applications to control the device bootstrapping process.
 *
 * OpenAPI spec version: 2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.connectorbootstrap.model;

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
 * PreSharedKey
 */

public class PreSharedKey implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("endpoint_name")
  private String endpointName = null;

  @SerializedName("secret_hex")
  private String secretHex = null;

  public PreSharedKey endpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

   /**
   * The unique endpoint identifier that this pre-shared key applies to. 16-64 [printable](https://en.wikipedia.org/wiki/ASCII#Printable_characters) (non-control) ASCII characters.
   * @return endpointName
  **/
  @ApiModelProperty(example = "my-endpoint-0001", required = true, value = "The unique endpoint identifier that this pre-shared key applies to. 16-64 [printable](https://en.wikipedia.org/wiki/ASCII#Printable_characters) (non-control) ASCII characters.")
  public String getEndpointName() {
    return endpointName;
  }

  public void setEndpointName(String endpointName) {
    this.endpointName = endpointName;
  }

  public PreSharedKey secretHex(String secretHex) {
    this.secretHex = secretHex;
    return this;
  }

   /**
   * The secret of the pre-shared key in hexadecimal. It is not case sensitive; 4a is same as 4A, and it is allowed with or without 0x in the beginning. The minimum length of the secret is 128 bits and maximum 256 bits.
   * @return secretHex
  **/
  @ApiModelProperty(example = "4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a4a", required = true, value = "The secret of the pre-shared key in hexadecimal. It is not case sensitive; 4a is same as 4A, and it is allowed with or without 0x in the beginning. The minimum length of the secret is 128 bits and maximum 256 bits.")
  public String getSecretHex() {
    return secretHex;
  }

  public void setSecretHex(String secretHex) {
    this.secretHex = secretHex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreSharedKey preSharedKey = (PreSharedKey) o;
    return Objects.equals(this.endpointName, preSharedKey.endpointName) &&
        Objects.equals(this.secretHex, preSharedKey.secretHex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, secretHex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreSharedKey {\n");
    
    sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
    sb.append("    secretHex: ").append(toIndentedString(secretHex)).append("\n");
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

