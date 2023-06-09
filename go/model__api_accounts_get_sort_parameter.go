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

// ApiAccountsGetSortParameter struct for ApiAccountsGetSortParameter
type ApiAccountsGetSortParameter struct {
	string *string
}

// Unmarshal JSON data into any of the pointers in the struct
func (dst *ApiAccountsGetSortParameter) UnmarshalJSON(data []byte) error {
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

	return fmt.Errorf("Data failed to match schemas in anyOf(ApiAccountsGetSortParameter)")
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src *ApiAccountsGetSortParameter) MarshalJSON() ([]byte, error) {
	if src.string != nil {
		return json.Marshal(&src.string)
	}

	return nil, nil // no data in anyOf schemas
}

type NullableApiAccountsGetSortParameter struct {
	value *ApiAccountsGetSortParameter
	isSet bool
}

func (v NullableApiAccountsGetSortParameter) Get() *ApiAccountsGetSortParameter {
	return v.value
}

func (v *NullableApiAccountsGetSortParameter) Set(val *ApiAccountsGetSortParameter) {
	v.value = val
	v.isSet = true
}

func (v NullableApiAccountsGetSortParameter) IsSet() bool {
	return v.isSet
}

func (v *NullableApiAccountsGetSortParameter) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableApiAccountsGetSortParameter(val *ApiAccountsGetSortParameter) *NullableApiAccountsGetSortParameter {
	return &NullableApiAccountsGetSortParameter{value: val, isSet: true}
}

func (v NullableApiAccountsGetSortParameter) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableApiAccountsGetSortParameter) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


