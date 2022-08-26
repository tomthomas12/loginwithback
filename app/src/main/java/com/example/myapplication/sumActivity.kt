package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class sumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sum)

        val num1 = findViewById(R.id.num1) as EditText
        val num2 = findViewById(R.id.num2) as EditText
        val totn = findViewById(R.id.result) as TextView
        val b1 = findViewById(R.id.addButton) as Button

        b1.setOnClickListener {
            val val1 = num1.text.toString().toInt()
            val val2 = num2.text.toString().toInt()
            val result = val1+val2
            totn.setText(result.toString())
        }
    }
}