package com.firstapp.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSignIn= findViewById<Button>(R.id.btnSignIn)
        val buttonLogin=findViewById<Button>(R.id.btnLogin)
        buttonSignIn.setOnClickListener{
            Toast.makeText(applicationContext, "Signup loading please wait",Toast.LENGTH_SHORT).show()
        }
buttonLogin.setOnClickListener{
    Toast.makeText(applicationContext, "Login please wait a few minutes",Toast.LENGTH_SHORT).show()
}

    }
}