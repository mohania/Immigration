package com.immigration.controller.login

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.immigration.R
import com.immigration.utils.Utils
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        login_btn_signup.setOnClickListener {
            startActivity(Intent(this,SignupActivity::class.java))
        }

        btn_forgot_pass.setOnClickListener {
           Utils.showToast(this,"hiii",Color.CYAN)
            // startActivity(Intent(this,ForgotPasswordActivity::class.java))
        }
    }
}