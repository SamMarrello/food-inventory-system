package com.example.model

@kotlinx.serialization.Serializable
data class StoreDraft(
    val name: String,
    val location: String,
    val firstnameContact: String,
    val lastnameContact: String,
    val phoneNumber: Int,
    val specialization: String
)
