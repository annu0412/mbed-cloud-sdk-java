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
 * 403 Forbidden.
 */
@ApiModel(description = "403 Forbidden.")

public class ForbiddenErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("code")
  private Integer code = null;

  @SerializedName("message")
  private String message = null;

  /**
   * Always set to &#39;error&#39;.
   */
  @JsonAdapter(ObjectEnum.Adapter.class)
  public enum ObjectEnum {
    ERROR("error");

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

  @SerializedName("request_id")
  private String requestId = null;

  /**
   * Error type. Always set to &#39;forbidden&#39;.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    FORBIDDEN("forbidden");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  public ForbiddenErrorResponse code(Integer code) {
    this.code = code;
    return this;
  }

   /**
   * Response code. Always set to 403.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "Response code. Always set to 403.")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ForbiddenErrorResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * A human readable message with detailed info.
   * @return message
  **/
  @ApiModelProperty(required = true, value = "A human readable message with detailed info.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ForbiddenErrorResponse object(ObjectEnum object) {
    this.object = object;
    return this;
  }

   /**
   * Always set to &#39;error&#39;.
   * @return object
  **/
  @ApiModelProperty(required = true, value = "Always set to 'error'.")
  public ObjectEnum getObject() {
    return object;
  }

  public void setObject(ObjectEnum object) {
    this.object = object;
  }

  public ForbiddenErrorResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Request ID
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "Request ID")
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ForbiddenErrorResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Error type. Always set to &#39;forbidden&#39;.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Error type. Always set to 'forbidden'.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForbiddenErrorResponse forbiddenErrorResponse = (ForbiddenErrorResponse) o;
    return Objects.equals(this.code, forbiddenErrorResponse.code) &&
        Objects.equals(this.message, forbiddenErrorResponse.message) &&
        Objects.equals(this.object, forbiddenErrorResponse.object) &&
        Objects.equals(this.requestId, forbiddenErrorResponse.requestId) &&
        Objects.equals(this.type, forbiddenErrorResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, object, requestId, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForbiddenErrorResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

