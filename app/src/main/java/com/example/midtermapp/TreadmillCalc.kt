package com.example.midtermapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class TreadmillCalc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treadmill_calc)
        val calculateButton: Button = findViewById(R.id.CalcButton)
        val backButton: Button = findViewById(R.id.BackButton)
        val mins: EditText = findViewById(R.id.minutes)
        val sec: EditText = findViewById(R.id.seconds)
        calculateButton.setOnClickListener {
            val minute = mins.text.toString().toInt()
            val second = sec.text.toString().toInt()
            val total = 3600 / ((minute * 60) + second).toDouble()
            Toast.makeText(this, total.toString(), Toast.LENGTH_LONG).show()
        }
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}