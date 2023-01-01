package com.example.lapor_yuk.Api

import com.example.lapor_yuk.LoginRequest
import com.example.lapor_yuk.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiServices {
    @POST("/api/login")
    fun login(@Body request: LoginRequest): Call<LoginResponse>
}