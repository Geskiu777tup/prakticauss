package com.example.usspraktica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splesh_sscreen)
        val splashScreenDuration:Long=2000
       Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}