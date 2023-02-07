package com.example.simple_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class BirthDay_Card : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_day_card)

        val tv2 = findViewById<TextView>(R.id.tv2)

        val name = intent.getStringExtra("name");
        tv2.text = "Happy Birthday $name!"

    }
}
