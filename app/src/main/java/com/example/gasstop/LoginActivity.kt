package com.example.gasstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    lateinit var btnsubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnsubmit = findViewById(R.id.mBtnSubmit)
        btnsubmit.setOnClickListener {

        }
    }
}