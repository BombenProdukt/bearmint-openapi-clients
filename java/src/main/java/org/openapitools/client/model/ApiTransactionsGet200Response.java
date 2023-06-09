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
 * ApiTransactionsGet200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-24T10:47:59.076628+03:00[Europe/Helsinki]")
public class ApiTransactionsGet200Response {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List data = null;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private Object links;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private Object meta;

  public ApiTransactionsGet200Response() {
  }

  public ApiTransactionsGet200Response data(List data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"id\":1,\"block_id\":2,\"hash\":\"3a84b182c61b7cb0554a4134416998e86b9440e943ad085e2c21fccdc472d079\",\"sender\":\"90d9012e313e004e9d93aa012289bc216d81e96aaacb1cb815ec2c13ab6944fc8ce6d99b5a4403bf05bd1c94eb96875e\",\"recipient\":\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\",\"gas\":100000000,\"nonce\":1,\"signature\":\"10c41c357456a96375f60dad79cbfbe834b5357c2c17653145e6a156fc6ce7391f77b9c4e17f26374cbfc1a1777d714a0fe415c2e79c8ed33768134ea3405bbe958563dfa3dfa87fc07e75f036d2debd32710718d4a7ff497db2b41e31b0bee2131367d58d8fc8d7e6503b9fb9ffd592ea4198fab4aa5d252b89dfafa5ee9cb606825b66a98b5077a9e904141d5924ea087a230884a6810c2c9f4e5ee4a7e49bf5cc43476f71bc9620fd9a3364779bacd05706838750b552c59286352a91224a\",\"version\":\"1.0.0\",\"message\":{\"handler\":\"@bearmint/bep-126\",\"version\":\"0.0.0\",\"network\":\"9a17e870d800a6c9cbc585355aff04c13de2770cc15bc88fefa1836d10092d4f\",\"content\":\"0aab010a233431383438623433313462322d343362662d383139642d34316165323161346237363312236436623936623862393637372d343636392d613061612d3862373462353435643631311a1568747470733a2f2f626561726d696e742e636f6d2f22052e6a736f6e2a13121140626561726d696e742f6265702d3134352a150801121140626561726d696e742f6265702d3134352a150802121140626561726d696e742f6265702d313435\"},\"message_deserialized\":{\"ops\":[{\"name\":\"41848b4314b2-43bf-819d-41ae21a4b763\",\"symbol\":\"d6b96b8b9677-4669-a0aa-8b74b545d611\",\"uriPrefix\":\"https://bearmint.com/\",\"uriSuffix\":\".json\",\"policies\":[{\"type\":0,\"name\":\"@bearmint/bep-145\"},{\"type\":1,\"name\":\"@bearmint/bep-145\"},{\"type\":2,\"name\":\"@bearmint/bep-145\"}]}]},\"created_at\":\"2022-10-09T02:12:30.000000Z\",\"updated_at\":\"2022-10-09T02:12:30.000000Z\"},{\"id\":2,\"block_id\":4,\"hash\":\"b0cb57687f8ccb8e2f430064824a2f954ab59e161b8f7aa81f84dbdf1aa034f3\",\"sender\":\"90d9012e313e004e9d93aa012289bc216d81e96aaacb1cb815ec2c13ab6944fc8ce6d99b5a4403bf05bd1c94eb96875e\",\"recipient\":\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\",\"gas\":100000000,\"nonce\":2,\"signature\":\"08f031252e5027f7682c2de796233f8f863b1828195451cec37a38dab7433d685ad0a7644215bdb6d26477e19d6e01260e0ac634a6fb27f1665009ad0943a31ff528d67625d94d485c474b24e4bf8cf732eaf39958e4892f599437e3fe108258162443869843474df1938937ad6e94392d8cc0d3bba6a62bf7285340d955ad1b88d59e5f0eaa312dd3f65658d6bb48490072b2801790f98f858d44ecac87afd3a721b158010df129734467d3eefb27b95f8ebadfd3c5c4d1d4ccaa45060b06a6\",\"version\":\"1.0.0\",\"message\":{\"handler\":\"@bearmint/bep-131\",\"version\":\"0.0.0\",\"network\":\"9a17e870d800a6c9cbc585355aff04c13de2770cc15bc88fefa1836d10092d4f\",\"content\":\"0a9c010a4034376265343236666536333733636631303436333661333865353766383236323463623434623633383965326539353438383763346136626539393231353335125862656172316a7276737a743333386371796138766e3467716a397a647579396b6372367432347439336577713461736b7038326d66676e376765656b656e6464796771616c716b3733653938746a36723475396d77656a6c\"},\"message_deserialized\":{\"ops\":[{\"hash\":\"47be426fe6373cf104636a38e57f82624cb44b6389e2e954887c4a6be9921535\",\"recipient\":\"bear1jrvszt338cqya8vn4gqj9zduy9kcr6t24t93ewq4askp82mfgn7geekenddygqalqk73e98tj6r4u9mwejl\"}]},\"created_at\":\"2022-10-09T02:12:30.000000Z\",\"updated_at\":\"2022-10-09T02:12:30.000000Z\"}]", value = "")

  public List getData() {
    return data;
  }


  public void setData(List data) {
    this.data = data;
  }


  public ApiTransactionsGet200Response links(Object links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"first\":\"/api/transactions?page%5Bcursor%5D=eyJoZWlnaHQiOjEwLCJfcG9pbnRzVG9OZXh0SXRlbXMiOmZhbHNlfQ\",\"last\":\"/api/transactions?page%5Bcursor%5D=eyJoZWlnaHQiOjExLCJfcG9pbnRzVG9OZXh0SXRlbXMiOnRydWV9\",\"prev\":\"/api/transactions?page%5Bcursor%5D=eyJoZWlnaHQiOjEwLCJfcG9pbnRzVG9OZXh0SXRlbXMiOmZhbHNlfQ\",\"next\":\"/api/transactions?page%5Bcursor%5D=eyJoZWlnaHQiOjExLCJfcG9pbnRzVG9OZXh0SXRlbXMiOnRydWV9\"}", value = "")

  public Object getLinks() {
    return links;
  }


  public void setLinks(Object links) {
    this.links = links;
  }


  public ApiTransactionsGet200Response meta(Object meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"path\":\"/api/transactions\",\"per_page\":100,\"next_cursor\":\"eyJoZWlnaHQiOjExLCJfcG9pbnRzVG9OZXh0SXRlbXMiOnRydWV9\",\"prev_cursor\":\"eyJoZWlnaHQiOjEwLCJfcG9pbnRzVG9OZXh0SXRlbXMiOmZhbHNlfQ\"}", value = "")

  public Object getMeta() {
    return meta;
  }


  public void setMeta(Object meta) {
    this.meta = meta;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiTransactionsGet200Response apiTransactionsGet200Response = (ApiTransactionsGet200Response) o;
    return Objects.equals(this.data, apiTransactionsGet200Response.data) &&
        Objects.equals(this.links, apiTransactionsGet200Response.links) &&
        Objects.equals(this.meta, apiTransactionsGet200Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiTransactionsGet200Response {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("links");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApiTransactionsGet200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApiTransactionsGet200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiTransactionsGet200Response is not found in the empty JSON string", ApiTransactionsGet200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApiTransactionsGet200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApiTransactionsGet200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiTransactionsGet200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiTransactionsGet200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiTransactionsGet200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiTransactionsGet200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiTransactionsGet200Response>() {
           @Override
           public void write(JsonWriter out, ApiTransactionsGet200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApiTransactionsGet200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApiTransactionsGet200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiTransactionsGet200Response
  * @throws IOException if the JSON string is invalid with respect to ApiTransactionsGet200Response
  */
  public static ApiTransactionsGet200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiTransactionsGet200Response.class);
  }

 /**
  * Convert an instance of ApiTransactionsGet200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

