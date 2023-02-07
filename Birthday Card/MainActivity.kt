package com.example.simple_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Create_birthday_Card(view: View) {
        val et = findViewById<EditText>(R.id.et)
        val name = et.text.toString()
        val intent = Intent(this,BirthDay_Card::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }
}
