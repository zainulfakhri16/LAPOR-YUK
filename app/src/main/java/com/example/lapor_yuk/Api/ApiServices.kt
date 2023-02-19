package com.example.lapor_yuk.Api

import com.example.lapor_yuk.helper.BodyLogin
import com.example.lapor_yuk.helper.LoginResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiServices {
//    @POST("/api/login")
//    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @POST("api/login")
    fun postLogin(@Body bodyLogin: BodyLogin?): Call<LoginResponse?>?

}