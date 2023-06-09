/*
 * Railway
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Default, Serialize, Deserialize)]
pub struct TransactionMetadata {
    /// The id of the object.
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<i32>,
    /// The id of the object.
    #[serde(rename = "transaction_id", skip_serializing_if = "Option::is_none")]
    pub transaction_id: Option<i32>,
    /// The id of the object.
    #[serde(rename = "module", skip_serializing_if = "Option::is_none")]
    pub module: Option<String>,
    /// The id of the object.
    #[serde(rename = "key", skip_serializing_if = "Option::is_none")]
    pub key: Option<String>,
    /// The id of the object.
    #[serde(rename = "value", skip_serializing_if = "Option::is_none")]
    pub value: Option<String>,
    /// The creation date of the object.
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// The updating date of the object.
    #[serde(rename = "updated_at", skip_serializing_if = "Option::is_none")]
    pub updated_at: Option<String>,
}

impl TransactionMetadata {
    pub fn new() -> TransactionMetadata {
        TransactionMetadata {
            id: None,
            transaction_id: None,
            module: None,
            key: None,
            value: None,
            created_at: None,
            updated_at: None,
        }
    }
}


