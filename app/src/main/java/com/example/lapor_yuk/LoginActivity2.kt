package com.example.lapor_yuk

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.lapor_yuk.helper.BodyLogin
import com.example.lapor_yuk.helper.LoginResponse
import com.example.lapor_yuk.helper.RestClient
import kotlinx.android.synthetic.main.activity_login2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)


        val buttonlogin: Button = findViewById(R.id.bt_jelajah)
        //buttonlogin.setOnClickListener { s.setStatusLogin(true)}
        buttonlogin.setOnClickListener {


            val bodyLogin = BodyLogin()
            bodyLogin.setEmail(et_email.getText().toString())
            bodyLogin.setPassword(et_pass.getText().toString())


            RestClient.service?.postLogin(bodyLogin)?.enqueue(object : Callback<LoginResponse?> {
                // TODO method dibawah otomatis pada saat new Callback
                override fun onResponse(
                    call: Call<LoginResponse?>,
                    response: Response<LoginResponse?>
                ) {
                    Toast.makeText(
                        this@LoginActivity2,
                        response.body()!!.getToken(),
                        Toast.LENGTH_SHORT
                    ).show()
                    Log.i("Response", response.message())
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    finish()
                }

                override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {

                }

            })
//            val loginRequest = LoginRequest(email = "awimaulana19@gmail.com", password = "awi123")
//            //val call = ApiServices.login(loginRequest)
//            val call = ApiServices.login(loginRequest)
//            //call.enqueue(object: Callback<LoginResponse>)
//            call.enqueue(object : Callback<LoginResponse> {
//                override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
//                    if (response.isSuccessful) {
//
//                    }
//                }
//
//                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
//
//                }
//            })
////            val intent = Intent(this, HomeActivity::class.java)
////            startActivity(intent)
        }

        val btn_twitter: ImageView = findViewById(R.id.iv_twitter)
        val btn_facebook: ImageView = findViewById(R.id.iv_facebook)
        val btn_ig: ImageView = findViewById(R.id.iv_instagram)

        val daftar: LinearLayout = findViewById(R.id.ll_daftar)

        btn_twitter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/home"))
            startActivity(intent)
        }
        btn_facebook.setOnClickListener {
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("https://web.facebook.com/?_rdc=1&_rdr"))
            startActivity(intent)
        }
        btn_ig.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"))
            startActivity(intent)
        }
        daftar.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }


    }

//    fun login(){
//        val user = findViewById(R.id.et_email) as EditText
//        val pass = findViewById(R.id.et_pass) as EditText
//        if (isValid(user.text.toString(),pass.text.toString())){
//            Toast.makeText(this,"Login Successful", Toast.LENGTH_SHORT).show()
//            val intent = Intent (this,HomeActivity::class.java)
//            startActivity(intent)
//        }else{
//            Toast.makeText(this, "${user.text} is logged in", Toast.LENGTH_SHORT).show()
//        }
//    }
//    fun isValid(user: String, pass: String):Boolean{
//
//        return (user == "zain" && pass == "16")
//    }
}