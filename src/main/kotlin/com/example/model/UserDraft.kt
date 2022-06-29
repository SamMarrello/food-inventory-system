package com.example.model

@kotlinx.serialization.Serializable
data class UserDraft(
    val username: String,
    val password: String,
    val storeId: String?,
    val warehouseId: String?
)
