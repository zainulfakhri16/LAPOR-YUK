package com.example.lapor_yuk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        bt_daftar.setOnClickListener{
            regist()
        }
    }

    fun regist(){
        if(et_email_su.text.isEmpty()){
            et_email_su.error="email tidak boleh kosong"
            et_email_su.requestFocus()
            return
        }else if(et_nomor_su.text.isEmpty()){
            et_nomor_su.error="email tidak boleh kosong"
            et_nomor_su.requestFocus()
            return
        }else if(et_nomor_su.text.isEmpty()){
            et_nomor_su.error="email tidak boleh kosong"
            et_nomor_su.requestFocus()
            return
        }else if(et_pass_su.text.isEmpty()){
            et_pass_su.error="email tidak boleh kosong"
            et_pass_su.requestFocus()
            return
        }
    }
}