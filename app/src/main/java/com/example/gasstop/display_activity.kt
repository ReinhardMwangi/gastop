package com.example.gasstop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class display_activity : AppCompatActivity() {
    lateinit var btnSea: Button
    lateinit var btnTotal: Button
    lateinit var btnPro: Button
    lateinit var btnKgas: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_shape)
    }
}