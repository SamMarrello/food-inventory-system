package com.example.model

@kotlinx.serialization.Serializable
data class WarehouseDraft(
    val name: String,
    val location: String,
    val firstnameContact: String,
    val lastnameContact: String,
    val phoneNumber: Int
)
