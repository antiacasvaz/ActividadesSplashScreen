package com.cursokotlin.concelloteo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class entroido : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entroido)

        val botonRaris = findViewById<ImageButton>(R.id.botonRaris)
        val botonReis = findViewById<ImageButton>(R.id.botonReis)
        val botonCacheiras = findViewById<ImageButton>(R.id.botonCacheiras)


        botonRaris.setOnClickListener {
            val acceder = Intent(this, mapaRaris::class.java)
            startActivity(acceder)
        }
        botonReis.setOnClickListener {
            val acceder = Intent(this, mapaReis::class.java)
            startActivity(acceder)
        }
        botonCacheiras.setOnClickListener {
            val acceder = Intent(this, mapaCacheiras::class.java)
            startActivity(acceder)
        }
    }
}