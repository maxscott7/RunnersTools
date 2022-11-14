package com.example.midtermapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tpcButton: Button = findViewById(R.id.tpc)
        tpcButton.setOnClickListener {
            val intent = Intent(this, TreadmillCalc::class.java)
            startActivity(intent)
        }
    }
}