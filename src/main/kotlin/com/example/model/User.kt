package com.example.model

@kotlinx.serialization.Serializable
data class User(
    val id: String,
    val userName: String,
    val password: String,
    val authority: Authority
)
