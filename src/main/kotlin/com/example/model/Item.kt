package com.example.model

@kotlinx.serialization.Serializable
data class Item(
    val id: Int,
    val amount: Int,
    val name: String,
    val expires: Boolean,
    val expiry: String,
    //val warehouseLocation: Warehouse?
    //val storeLocation: Store?
)
