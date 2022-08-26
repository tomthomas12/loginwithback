package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class secActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sec)

        val usern = findViewById(R.id.user) as EditText
        val passw = findViewById(R.id.password) as EditText
        val totn = findViewById(R.id.result) as TextView
        val b1 = findViewById(R.id.login) as Button

        var users = mapOf<String, String>("tom" to "hello", "john" to "hey")
        b1.setOnClickListener {
            val username = usern.text.toString()
            Log.d("tom", "onCreate: ${username}")

            val password = passw.text.toString()
            Log.d("tom", "onCreate: " + password)
            if (users.containsKey(username) && users[username]==password) {
                Log.d("tom", "onCreate: inside ")
                Toast.makeText(this,"Logedn", Toast.LENGTH_LONG).show()
                val inten = Intent(this,sumActivity::class.java)
                startActivity(inten)
            } else {
                totn.setText("worng user")
            }

        }
    }
}