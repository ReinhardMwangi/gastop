package com.example.gasstop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.lang.Thread.sleep

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        var splash = Thread{
            kotlin.run {
                sleep(2000)
                startActivity(Intent(this,RegisterActivity::class.java))
            }
        }
        splash.start()
    }
}
