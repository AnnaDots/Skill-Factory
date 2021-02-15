package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("netology voice", "start of onCreate function")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myText: String = "Hello, world!"
        val myNumber: Int = 42
        val myFloatingNumber: Double = 3.14
        val outputText = myText + " " + myNumber + " " + myFloatingNumber

        // Log.e("Netology", outputText)

        val textView = findViewById<TextView>(R.id.text_output)
        textView.text = outputText

        Log.d("netology voice", "end of onCreate function")
    }
}