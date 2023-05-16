package com.example.gasstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class AdminActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth


    lateinit var mBtnAddDepot: Button

    lateinit var mBtnAddGasBrand: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        mBtnAddDepot = findViewById(R.id.mBtnAddDepot)
        mBtnAddGasBrand = findViewById(R.id.mBtnAddGasBrand)


        mBtnAddDepot.setOnClickListener {
            val jaza = Intent(this@AdminActivity,AddDepotActivity::class.java)
            startActivity(jaza)
        }

        mBtnAddGasBrand.setOnClickListener {
            val jaza = Intent(this@AdminActivity,AddGasActivity::class.java)
            startActivity(jaza)
        }

    }
}