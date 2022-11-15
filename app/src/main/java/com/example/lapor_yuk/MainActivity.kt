package com.example.lapor_yuk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splashscreen: Long = 3000
        Handler().postDelayed({
            val intent = Intent(this,JelajahiActivity::class.java)
            startActivity(intent)
            finish()
        },splashscreen)
    }
}