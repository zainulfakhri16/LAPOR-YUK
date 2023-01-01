package com.example.lapor_yuk

data class LoginResponse (
    val id: Long,
    val name: String,
    val email: String,
    val emailVerifiedAt: Any? = null,
    val token: String,
    val createdAt: Any? = null,
    val updatedAt: String
)
