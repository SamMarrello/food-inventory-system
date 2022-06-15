package com.example.model

@kotlinx.serialization.Serializable
data class Warehouse(
    val id: Int,
    val name: String,
    val location: String,
    val firstnameContact: String,
    val lastnameContact: String,
    val phoneNumber: Int
)
