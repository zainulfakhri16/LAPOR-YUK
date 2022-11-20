package com.example.lapor_yuk

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import java.net.URL

class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

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