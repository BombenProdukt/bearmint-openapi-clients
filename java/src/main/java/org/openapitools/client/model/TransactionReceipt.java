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
import java.util.List;

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
 * TransactionReceipt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T10:47:59.076628+03:00[Europe/Helsinki]")
public class TransactionReceipt {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transaction_id";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private Integer transactionId;

  public static final String SERIALIZED_NAME_BLOCK_HASH = "block_hash";
  @SerializedName(SERIALIZED_NAME_BLOCK_HASH)
  private String blockHash;

  public static final String SERIALIZED_NAME_BLOCK_NUMBER = "block_number";
  @SerializedName(SERIALIZED_NAME_BLOCK_NUMBER)
  private Integer blockNumber;

  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List logs = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public TransactionReceipt() {
  }

  public TransactionReceipt id(Integer id) {
    
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


  public TransactionReceipt transactionId(Integer transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * The id of the object.
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "The id of the object.")

  public Integer getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(Integer transactionId) {
    this.transactionId = transactionId;
  }


  public TransactionReceipt blockHash(String blockHash) {
    
    this.blockHash = blockHash;
    return this;
  }

   /**
   * The id of the object.
   * @return blockHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Cda8V4lhwCNGlm2DIFKX7asRiHHD8XWtxNp/fKTFLPQ=", value = "The id of the object.")

  public String getBlockHash() {
    return blockHash;
  }


  public void setBlockHash(String blockHash) {
    this.blockHash = blockHash;
  }


  public TransactionReceipt blockNumber(Integer blockNumber) {
    
    this.blockNumber = blockNumber;
    return this;
  }

   /**
   * The id of the object.
   * @return blockNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "The id of the object.")

  public Integer getBlockNumber() {
    return blockNumber;
  }


  public void setBlockNumber(Integer blockNumber) {
    this.blockNumber = blockNumber;
  }


  public TransactionReceipt logs(List logs) {
    
    this.logs = logs;
    return this;
  }

   /**
   * The id of the object.
   * @return logs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"event\":\"MetadataCreated\",\"args\":{\"_modelKey\":\"ec667f03c0d3d929d09a80c947dbce6ac3b65193fca08c3543b1a4b0a27bd03b\",\"_modelSubType\":\"metadata\",\"_modelType\":\"tx\",\"_module\":\"@bearmint/bep-131\",\"_opIndex\":\"0\",\"key\":\"id\",\"value\":{\"id\":1}}},{\"event\":\"MetadataCreated\",\"args\":{\"_modelKey\":\"ec667f03c0d3d929d09a80c947dbce6ac3b65193fca08c3543b1a4b0a27bd03b\",\"_modelSubType\":\"metadata\",\"_modelType\":\"tx\",\"_module\":\"@bearmint/bep-131\",\"_opIndex\":\"0\",\"key\":\"hash\",\"value\":{\"hash\":\"3d262af20ff9158e8194eadb43a06609dd82dfc3d515eb539cb3e945655538cb\"}}},{\"event\":\"OwnerChanged\",\"args\":{\"_modelKey\":\"bear1j4vvs55nfkjffkewadw5atzyqsmmtvtj2rcwjcvk2qfc85k5w52j545nzgez4hsw67h9vzyu958rj3g20zt\",\"_modelSubType\":\"metadata\",\"_modelType\":\"account\",\"_module\":\"@bearmint/bep-131\",\"_opIndex\":\"0\",\"key\":\"inventory\",\"value\":[\"3d262af20ff9158e8194eadb43a06609dd82dfc3d515eb539cb3e945655538cb\"]}},{\"event\":\"MetadataCreated\",\"args\":{\"_modelKey\":\"ec667f03c0d3d929d09a80c947dbce6ac3b65193fca08c3543b1a4b0a27bd03b\",\"_modelSubType\":\"metadata\",\"_modelType\":\"tx\",\"_module\":\"@bearmint/bep-131\",\"_opIndex\":\"0\",\"key\":\"token\",\"value\":{\"id\":1,\"hash\":\"3d262af20ff9158e8194eadb43a06609dd82dfc3d515eb539cb3e945655538cb\",\"collection\":\"51e24f910c4b539280a8e0c8e3fc8119312d236aea36428165ab11f2c1ce2f18\",\"owner\":\"bear1j4vvs55nfkjffkewadw5atzyqsmmtvtj2rcwjcvk2qfc85k5w52j545nzgez4hsw67h9vzyu958rj3g20zt\"}}},{\"event\":\"MetadataUpdated\",\"args\":{\"_modelKey\":\"ec667f03c0d3d929d09a80c947dbce6ac3b65193fca08c3543b1a4b0a27bd03b\",\"_modelSubType\":\"metadata\",\"_modelType\":\"tx\",\"_module\":\"@bearmint/bep-126\",\"key\":\"collection\",\"value\":{\"id\":\"51e24f910c4b539280a8e0c8e3fc8119312d236aea36428165ab11f2c1ce2f18\",\"name\":\"fc3296116a5b-42f8-8c41-5b51dd3813cb\",\"symbol\":\"f4af54f78243-4cd9-8ef5-09db6190c69a\",\"uriPrefix\":\"https://bearmint.com/\",\"uriSuffix\":\".json\",\"tokens\":[\"3d262af20ff9158e8194eadb43a06609dd82dfc3d515eb539cb3e945655538cb\"],\"initialOwner\":\"bear1j4vvs55nfkjffkewadw5atzyqsmmtvtj2rcwjcvk2qfc85k5w52j545nzgez4hsw67h9vzyu958rj3g20zt\",\"currentOwner\":\"bear1j4vvs55nfkjffkewadw5atzyqsmmtvtj2rcwjcvk2qfc85k5w52j545nzgez4hsw67h9vzyu958rj3g20zt\",\"accessControlList\":{\"bear1j4vvs55nfkjffkewadw5atzyqsmmtvtj2rcwjcvk2qfc85k5w52j545nzgez4hsw67h9vzyu958rj3g20zt\":{\"permissions\":[0,1,2]}},\"policies\":[{\"name\":\"@bearmint/bep-145\"},{\"type\":1,\"name\":\"@bearmint/bep-145\"},{\"type\":2,\"name\":\"@bearmint/bep-145\"}]}}}]", value = "The id of the object.")

  public List getLogs() {
    return logs;
  }


  public void setLogs(List logs) {
    this.logs = logs;
  }


  public TransactionReceipt createdAt(OffsetDateTime createdAt) {
    
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


  public TransactionReceipt updatedAt(OffsetDateTime updatedAt) {
    
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
    TransactionReceipt transactionReceipt = (TransactionReceipt) o;
    return Objects.equals(this.id, transactionReceipt.id) &&
        Objects.equals(this.transactionId, transactionReceipt.transactionId) &&
        Objects.equals(this.blockHash, transactionReceipt.blockHash) &&
        Objects.equals(this.blockNumber, transactionReceipt.blockNumber) &&
        Objects.equals(this.logs, transactionReceipt.logs) &&
        Objects.equals(this.createdAt, transactionReceipt.createdAt) &&
        Objects.equals(this.updatedAt, transactionReceipt.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionId, blockHash, blockNumber, logs, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionReceipt {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    blockHash: ").append(toIndentedString(blockHash)).append("\n");
    sb.append("    blockNumber: ").append(toIndentedString(blockNumber)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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
    openapiFields.add("block_hash");
    openapiFields.add("block_number");
    openapiFields.add("logs");
    openapiFields.add("created_at");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TransactionReceipt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TransactionReceipt.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionReceipt is not found in the empty JSON string", TransactionReceipt.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TransactionReceipt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TransactionReceipt` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("block_hash") != null && !jsonObj.get("block_hash").isJsonNull()) && !jsonObj.get("block_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `block_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("block_hash").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TransactionReceipt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TransactionReceipt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TransactionReceipt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TransactionReceipt.class));

       return (TypeAdapter<T>) new TypeAdapter<TransactionReceipt>() {
           @Override
           public void write(JsonWriter out, TransactionReceipt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TransactionReceipt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TransactionReceipt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TransactionReceipt
  * @throws IOException if the JSON string is invalid with respect to TransactionReceipt
  */
  public static TransactionReceipt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TransactionReceipt.class);
  }

 /**
  * Convert an instance of TransactionReceipt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
