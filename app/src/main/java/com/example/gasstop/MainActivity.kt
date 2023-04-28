package com.example.gasstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnLogin: Button
    lateinit var btnSignup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin = findViewById(R.id.mBtnLogin)
        btnSignup = findViewById(R.id.mBtnSubmit)

        btnLogin.setOnClickListener {
            val sajili = Intent(this@MainActivity,LoginActivity::class.java)
            startActivity(sajili)
        }
        btnSignup.setOnClickListener {
            val sajili = Intent(this@MainActivity,RegisterActivity::class.java)
            startActivity(sajili)
        }
    }
}


