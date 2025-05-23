package com.eduardo.intro_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.eduardo.intro_kotlin.Cinepolis.CinepolisActivity
import com.eduardo.intro_kotlin.practica1.saludoActivity
import com.eduardo.intro_kotlin.practica2.OperasActivity
import com.eduardo.intro_kotlin.practica3.ejemplo3
import com.eduardo.intro_kotlin.practica4.ArchivosActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnCinepolis = findViewById<Button>(R.id.btn2)
        val btnEjemplo3 = findViewById<Button>(R.id.btn3)
        val btnEjemplo4 = findViewById<Button>(R.id.btn4)
        val btnEjemplo5 = findViewById<Button>(R.id.btn5)

        btnSaludo.setOnClickListener { navigayeToSaludo() }
        btnCinepolis.setOnClickListener { navigateToCinepolis() }
        btnEjemplo3.setOnClickListener { navigateToEjemplo3() }
        btnEjemplo5.setOnClickListener { navigateToEjemplo5() }
        btnEjemplo4.setOnClickListener { navigateToEjemplo4() }
    }

    private fun navigateToEjemplo4() {
        val intent = Intent(this, OperasActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEjemplo5() {
        val intent = Intent(this, ArchivosActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEjemplo3() {
        val intent = Intent(this, ejemplo3::class.java)
        startActivity(intent)
    }

    private fun navigayeToSaludo() {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCinepolis() {
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)
    }
}