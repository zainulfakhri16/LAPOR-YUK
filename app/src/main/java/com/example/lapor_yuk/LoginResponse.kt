package com.example.lapor_yuk.Api

data class LoginResponse(
    val success: Boolean,
    val message: String,
    val user: User?,
    val token: String?
)

data class User(
    val name: String,
    val email: String
)