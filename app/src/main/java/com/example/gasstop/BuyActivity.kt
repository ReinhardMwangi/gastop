package com.example.gasstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BuyActivity : AppCompatActivity() {

    lateinit var BtnPAY : Button
    lateinit var mBtnSupplier1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitybuy)
        BtnPAY = findViewById(R.id.mBtnMpesa1)
        mBtnSupplier1 = findViewById(R.id.mBtnSupplier1)

        BtnPAY.setOnClickListener {
            val jaza = Intent(this@BuyActivity,BuyActivity::class.java)
            startActivity(jaza)
        }

        mBtnSupplier1.setOnClickListener {
            val jaza = Intent(this@BuyActivity,RefillActivity::class.java)
            startActivity(jaza)
        }

    }
}