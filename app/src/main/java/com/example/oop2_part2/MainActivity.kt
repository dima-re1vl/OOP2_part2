package com.example.oop2_part2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.card1).setOnClickListener {
            val intent = Intent(this, card1_statictic::class.java)
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.card2).setOnClickListener {
            val intent = Intent(this, Card2_statictic::class.java)
            startActivity(intent)
        }
    }
}
