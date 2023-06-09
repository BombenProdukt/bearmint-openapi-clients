/*
Railway

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

API version: 1.0.0
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"fmt"
)

// ApiTransactionsGetSortParameter struct for ApiTransactionsGetSortParameter
type ApiTransactionsGetSortParameter struct {
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ApiTransactionsGetSortParameter) UnmarshalJSON(data []byte) error {
	var err error
	// try to unmarshal JSON data into string
	err = json.Unmarshal(data, &dst.string);
	if err == nil {
		jsonstring, _ := json.Marshal(dst.string)
		if string(jsonstring) == "{}" { // empty struct
			dst.string = nil
		} else {
			return nil // data stored in dst.string, return on the first match
		}
	} else {
		dst.string = nil
	}

	return fmt.Errorf("Data failed to match schemas in anyOf(ApiTransactionsGetSortParameter)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ApiTransactionsGetSortParameter) MarshalJSON() ([]byte, error) {
	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableApiTransactionsGetSortParameter struct {
	value *ApiTransactionsGetSortParameter
	isSet bool
}

func (v NullableApiTransactionsGetSortParameter) Get() *ApiTransactionsGetSortParameter {
	return v.value
}

func (v *NullableApiTransactionsGetSortParameter) Set(val *ApiTransactionsGetSortParameter) {
	v.value = val
	v.isSet = true
}

func (v NullableApiTransactionsGetSortParameter) IsSet() bool {
	return v.isSet
}

func (v *NullableApiTransactionsGetSortParameter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiTransactionsGetSortParameter(val *ApiTransactionsGetSortParameter) *NullableApiTransactionsGetSortParameter {
	return &NullableApiTransactionsGetSortParameter{value: val, isSet: true}
}

func (v NullableApiTransactionsGetSortParameter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiTransactionsGetSortParameter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


