package com.example.lapor_yuk.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiConfig {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://127.0.0.1:8000")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val ApiServices = retrofit.create(com.example.lapor_yuk.Api.ApiServices::class.java)
}