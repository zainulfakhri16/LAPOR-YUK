package com.example.lapor_yuk.helper

import com.google.gson.annotations.SerializedName




class BodyLogin {
    @SerializedName("password")
    private var password: String? = null

    @SerializedName("email")
    private var email: String? = null

    fun setPassword(password: String?) {
        this.password = password
    }

    fun getPassword(): String? {
        return password
    }

    fun setEmail(email: String?) {
        this.email = email
    }

    fun getEmail(): String? {
        return email
    }

    override fun toString(): String {
        return "BodyLogin{" +
                "password = '" + password + '\'' +
                ",email = '" + email + '\'' +
                "}"
    }
}