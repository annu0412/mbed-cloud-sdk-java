/*
 * Update Service API
 * This is the API Documentation for the mbed deployment service which is part of the update service.
 *
 * OpenAPI spec version: 3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.arm.mbed.cloud.sdk.internal.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * ManifestContentsEncryptionMode
 */

public class ManifestContentsEncryptionMode implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("enum")
  private Integer _enum = null;

  public ManifestContentsEncryptionMode _enum(Integer _enum) {
    this._enum = _enum;
    return this;
  }

   /**
   * The encryption mode describing the kind of hashing, signing and, encryption in use. The following modes are available: 1: none-ecc-secp256r1-sha256: SHA-256 hashing, ECDSA signatures, using the secp256r1 curve. No payload encryption is used. 2: aes-128-ctr-ecc-secp256r1-sha256: SHA-256 hashing, ECDSA signatures, using the secp256r1 curve. The payload is encrypted with AES-128 in CTR-mode. 3: none-none-sha256: SHA-256 hashing. No signature is used. No payload encryption is used. This mode is not recommended except over existing, trusted connections. 
   * @return _enum
  **/
  @ApiModelProperty(example = "null", value = "The encryption mode describing the kind of hashing, signing and, encryption in use. The following modes are available: 1: none-ecc-secp256r1-sha256: SHA-256 hashing, ECDSA signatures, using the secp256r1 curve. No payload encryption is used. 2: aes-128-ctr-ecc-secp256r1-sha256: SHA-256 hashing, ECDSA signatures, using the secp256r1 curve. The payload is encrypted with AES-128 in CTR-mode. 3: none-none-sha256: SHA-256 hashing. No signature is used. No payload encryption is used. This mode is not recommended except over existing, trusted connections. ")
  public Integer getEnum() {
    return _enum;
  }

  public void setEnum(Integer _enum) {
    this._enum = _enum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestContentsEncryptionMode manifestContentsEncryptionMode = (ManifestContentsEncryptionMode) o;
    return Objects.equals(this._enum, manifestContentsEncryptionMode._enum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_enum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestContentsEncryptionMode {\n");
    
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
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

