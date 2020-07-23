package com.example.giasuviet

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        lb_dangKy.setOnClickListener {
            startActivity(Intent(this, Signup::class.java))
        }

        lb_quenMatKhau.setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
        }
    }

    
}
