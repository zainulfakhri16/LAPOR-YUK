package com.example.lapor_yuk

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import com.example.lapor_yuk.Api.ApiConfig
import com.example.lapor_yuk.Api.ApiConfig.ApiServices
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        val button: Button = findViewById(R.id.bt_jelajah)
        button.setOnClickListener {
            val loginRequest = LoginRequest(email = "awimaulana19@gmail.com", password = "awi123")
            //val call = ApiServices.login(loginRequest)
            val call = ApiServices.login(loginRequest)
            //call.enqueue(object: Callback<LoginResponse>)
            call.enqueue(object : Callback<LoginResponse> {
                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                    if (response.isSuccessful) {

                    }
                }

                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {

                }
            })
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val btn_twitter:ImageView=findViewById(R.id.iv_twitter)
        val btn_facebook:ImageView=findViewById(R.id.iv_facebook)
        val btn_ig:ImageView=findViewById(R.id.iv_instagram)

        val daftar:LinearLayout=findViewById(R.id.ll_daftar)

        btn_twitter.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/home"))
            startActivity(intent)
        }
        btn_facebook.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/?_rdc=1&_rdr"))
            startActivity(intent)
        }
        btn_ig.setOnClickListener {
            val intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"))
            startActivity(intent)
        }
        daftar.setOnClickListener{
            val intent=Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }


    }
}