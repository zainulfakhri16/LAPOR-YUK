package com.example.lapor_yuk.helper

import com.example.lapor_yuk.Api.ApiServices
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


internal object RestClient {

    // Membuat base URL
    // TODO menginisiasi MainInterface
    var service: ApiServices? = null
        get() {
            if (field == null) {
                // Membuat base URL
                val BASE_URL = "https://reqres.in/"
                val httpClient = OkHttpClient.Builder()
                val builder = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                val retrofit = builder.client(httpClient.build()).build()
                field = retrofit.create(ApiServices::class.java)
            }
            return field
        }
        private set
}
