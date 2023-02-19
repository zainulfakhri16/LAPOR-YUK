package com.example.lapor_yuk.helper

import com.google.gson.annotations.SerializedName


class LoginResponse {

    @SerializedName("token")
    private var token: String? = null

    fun setToken(token: String?) {
        this.token = token
    }

    fun getToken(): String? {
        return token
    }

    override fun toString(): String {
        return "LoginResponse{" +
                "token = '" + token + '\'' +
                "}"
    }

    }