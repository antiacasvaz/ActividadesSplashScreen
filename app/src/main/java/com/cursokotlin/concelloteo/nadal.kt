package com.cursokotlin.concelloteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class nadal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nadal)
        val imageButton13 = findViewById<ImageButton>(R.id.imageButton13)
        val imageButton15 = findViewById<ImageButton>(R.id.imageButton15)
        val imageButton17 = findViewById<ImageButton>(R.id.imageButton17)

        imageButton13.setOnClickListener {
            val acceder = Intent(this, concertos::class.java)
            startActivity(acceder)
        }
        imageButton15.setOnClickListener {
            val acceder = Intent(this, obradoiros::class.java)
            startActivity(acceder)
        }
        imageButton17.setOnClickListener {
            val acceder = Intent(this, mercados::class.java)
            startActivity(acceder)
        }
    }
}
