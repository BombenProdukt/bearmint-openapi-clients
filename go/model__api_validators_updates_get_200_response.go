/*
Railway

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
)

// ApiValidatorsUpdatesGet200Response struct for ApiValidatorsUpdatesGet200Response
type ApiValidatorsUpdatesGet200Response struct {
	Data *Array `json:"data,omitempty"`
	Links map[string]interface{} `json:"links,omitempty"`
	Meta map[string]interface{} `json:"meta,omitempty"`
}

// NewApiValidatorsUpdatesGet200Response instantiates a new ApiValidatorsUpdatesGet200Response object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewApiValidatorsUpdatesGet200Response() *ApiValidatorsUpdatesGet200Response {
	this := ApiValidatorsUpdatesGet200Response{}
	return &this
}

// NewApiValidatorsUpdatesGet200ResponseWithDefaults instantiates a new ApiValidatorsUpdatesGet200Response object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewApiValidatorsUpdatesGet200ResponseWithDefaults() *ApiValidatorsUpdatesGet200Response {
	this := ApiValidatorsUpdatesGet200Response{}
	return &this
}

// GetData returns the Data field value if set, zero value otherwise.
func (o *ApiValidatorsUpdatesGet200Response) GetData() Array {
	if o == nil || o.Data == nil {
		var ret Array
		return ret
	}
	return *o.Data
}

// GetDataOk returns a tuple with the Data field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiValidatorsUpdatesGet200Response) GetDataOk() (*Array, bool) {
	if o == nil || o.Data == nil {
		return nil, false
	}
	return o.Data, true
}

// HasData returns a boolean if a field has been set.
func (o *ApiValidatorsUpdatesGet200Response) HasData() bool {
	if o != nil && o.Data != nil {
		return true
	}

	return false
}

// SetData gets a reference to the given Array and assigns it to the Data field.
func (o *ApiValidatorsUpdatesGet200Response) SetData(v Array) {
	o.Data = &v
}

// GetLinks returns the Links field value if set, zero value otherwise.
func (o *ApiValidatorsUpdatesGet200Response) GetLinks() map[string]interface{} {
	if o == nil || o.Links == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Links
}

// GetLinksOk returns a tuple with the Links field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiValidatorsUpdatesGet200Response) GetLinksOk() (map[string]interface{}, bool) {
	if o == nil || o.Links == nil {
		return nil, false
	}
	return o.Links, true
}

// HasLinks returns a boolean if a field has been set.
func (o *ApiValidatorsUpdatesGet200Response) HasLinks() bool {
	if o != nil && o.Links != nil {
		return true
	}

	return false
}

// SetLinks gets a reference to the given map[string]interface{} and assigns it to the Links field.
func (o *ApiValidatorsUpdatesGet200Response) SetLinks(v map[string]interface{}) {
	o.Links = v
}

// GetMeta returns the Meta field value if set, zero value otherwise.
func (o *ApiValidatorsUpdatesGet200Response) GetMeta() map[string]interface{} {
	if o == nil || o.Meta == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Meta
}

// GetMetaOk returns a tuple with the Meta field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *ApiValidatorsUpdatesGet200Response) GetMetaOk() (map[string]interface{}, bool) {
	if o == nil || o.Meta == nil {
		return nil, false
	}
	return o.Meta, true
}

// HasMeta returns a boolean if a field has been set.
func (o *ApiValidatorsUpdatesGet200Response) HasMeta() bool {
	if o != nil && o.Meta != nil {
		return true
	}

	return false
}

// SetMeta gets a reference to the given map[string]interface{} and assigns it to the Meta field.
func (o *ApiValidatorsUpdatesGet200Response) SetMeta(v map[string]interface{}) {
	o.Meta = v
}

func (o ApiValidatorsUpdatesGet200Response) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.Data != nil {
		toSerialize["data"] = o.Data
	}
	if o.Links != nil {
		toSerialize["links"] = o.Links
	}
	if o.Meta != nil {
		toSerialize["meta"] = o.Meta
	}
	return json.Marshal(toSerialize)
}

type NullableApiValidatorsUpdatesGet200Response struct {
	value *ApiValidatorsUpdatesGet200Response
	isSet bool
}

func (v NullableApiValidatorsUpdatesGet200Response) Get() *ApiValidatorsUpdatesGet200Response {
	return v.value
}

func (v *NullableApiValidatorsUpdatesGet200Response) Set(val *ApiValidatorsUpdatesGet200Response) {
	v.value = val
	v.isSet = true
}

func (v NullableApiValidatorsUpdatesGet200Response) IsSet() bool {
	return v.isSet
}

func (v *NullableApiValidatorsUpdatesGet200Response) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiValidatorsUpdatesGet200Response(val *ApiValidatorsUpdatesGet200Response) *NullableApiValidatorsUpdatesGet200Response {
	return &NullableApiValidatorsUpdatesGet200Response{value: val, isSet: true}
}

func (v NullableApiValidatorsUpdatesGet200Response) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiValidatorsUpdatesGet200Response) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


