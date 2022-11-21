package com.example.usspraktica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun vpered(view: View) {
        val intent = Intent(this@MainActivity3,MainActivity4::class.java)
        startActivity(intent)
    }


    }
