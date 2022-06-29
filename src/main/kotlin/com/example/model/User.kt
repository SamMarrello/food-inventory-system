package com.example.model

@kotlinx.serialization.Serializable
data class User(
    val id: Int,
    val username: String,
    val password: String,
    val storeId: Int?,
    val warehouseId: Int?
)