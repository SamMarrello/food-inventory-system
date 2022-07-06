package com.example.model

data class ItemDraft(
    val amount: Int,
    val name: String,
    val expires: Boolean,
    val expiry: String,
    //val warehouseLocation: Warehouse?
    //val storeLocation: Store?
)