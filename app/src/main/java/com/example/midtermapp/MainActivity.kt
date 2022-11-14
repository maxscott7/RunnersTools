package com.example.midtermapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

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