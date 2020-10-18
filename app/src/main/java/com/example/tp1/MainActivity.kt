package com.example.tp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, R.string.Welcome, Toast.LENGTH_SHORT).show()
    }

    fun button1(view: View) {

        var editText = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, editText.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(editText.text)

    }
}