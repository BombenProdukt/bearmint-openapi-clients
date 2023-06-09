/*
 * Railway
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * TransactionMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T10:47:59.076628+03:00[Europe/Helsinki]")
public class TransactionMetadata {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private Integer transactionId;

  public static final String SERIALIZED_NAME_MODULE = "module";
  @SerializedName(SERIALIZED_NAME_MODULE)
  private String module;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TransactionMetadata() {
  }

  public TransactionMetadata id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the object.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The id of the object.")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public TransactionMetadata transactionId(Integer transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of the object.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The id of the object.")

  public Integer getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  public TransactionMetadata module(String module) {
    
    this.module = module;
    return this;
  }

   /**
   * The id of the object.
   * @return module
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "@bearmint/bep-126", value = "The id of the object.")

  public String getModule() {
    return module;
  }


  public void setModule(String module) {
    this.module = module;
  }


  public TransactionMetadata key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The id of the object.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "collection", value = "The id of the object.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TransactionMetadata value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The id of the object.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"id\":\"47be426fe6373cf104636a38e57f82624cb44b6389e2e954887c4a6be9921535\",\"name\":\"41848b4314b2-43bf-819d-41ae21a4b763\",\"symbol\":\"d6b96b8b9677-4669-a0aa-8b74b545d611\",\"uriPrefix\":\"https://bearmint.com/\",\"uriSuffix\":\".json\",\"initialOwner\":\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\",\"currentOwner\":\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\",\"accessControlList\":{\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\":{\"permissions\":[0,1,2]}},\"policies\":[{\"name\":\"@bearmint/bep-145\"},{\"type\":1,\"name\":\"@bearmint/bep-145\"},{\"type\":2,\"name\":\"@bearmint/bep-145\"}]}", value = "The id of the object.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public TransactionMetadata createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The creation date of the object.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-09T02:12:24Z", value = "The creation date of the object.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionMetadata updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The updating date of the object.
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-10-09T02:12:24Z", value = "The updating date of the object.")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionMetadata transactionMetadata = (TransactionMetadata) o;
    return Objects.equals(this.id, transactionMetadata.id) &&
        Objects.equals(this.transactionId, transactionMetadata.transactionId) &&
        Objects.equals(this.module, transactionMetadata.module) &&
        Objects.equals(this.key, transactionMetadata.key) &&
        Objects.equals(this.value, transactionMetadata.value) &&
        Objects.equals(this.createdAt, transactionMetadata.createdAt) &&
        Objects.equals(this.updatedAt, transactionMetadata.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, module, key, value, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("transaction_id");
    openapiFields.add("module");
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionMetadata is not found in the empty JSON string", TransactionMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("module") != null && !jsonObj.get("module").isJsonNull()) && !jsonObj.get("module").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `module` to be a primitive type in the JSON string but got `%s`", jsonObj.get("module").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionMetadata>() {
           @Override
           public void write(JsonWriter out, TransactionMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionMetadata
  * @throws IOException if the JSON string is invalid with respect to TransactionMetadata
  */
  public static TransactionMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionMetadata.class);
  }

 /**
  * Convert an instance of TransactionMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

