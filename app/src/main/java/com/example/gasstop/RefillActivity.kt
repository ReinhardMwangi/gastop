package com.example.gasstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RefillActivity : AppCompatActivity() {

    lateinit var BtnPAY : Button
    lateinit var mBtnSupplier : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refill)

        BtnPAY = findViewById(R.id.mBtnMpesa)
        mBtnSupplier = findViewById(R.id.mBtnSupplier)

        BtnPAY.setOnClickListener {
            val jaza = Intent(this@RefillActivity,BuyActivity::class.java)
            startActivity(jaza)
        }

        mBtnSupplier.setOnClickListener {
            val jaza = Intent(this@RefillActivity,RefillActivity::class.java)
            startActivity(jaza)
        }

    }
}