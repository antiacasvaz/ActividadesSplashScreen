package com.cursokotlin.concelloteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class actividades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividades)



       val boton5 = findViewById<ImageButton>(R.id.boton5)
        val boton6=findViewById<ImageButton>(R.id.boton6)
        val boton7=findViewById<ImageButton>(R.id.boton7)
        val boton8=findViewById<ImageButton>(R.id.boton8)

        boton5.setOnClickListener {
            val acceder = Intent(this, festasGastronomicas::class.java)
            startActivity(acceder)
        }
        boton6.setOnClickListener {
            val acceder = Intent(this, entroido::class.java)
            startActivity(acceder)
        }
        boton7.setOnClickListener {
            val acceder = Intent(this, batalla::class.java)
            startActivity(acceder)
        }
        boton8.setOnClickListener {
            val acceder = Intent(this, nadal::class.java)
            startActivity(acceder)
        }
    }
}