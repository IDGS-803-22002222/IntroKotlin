package com.eduardo.intro_kotlin.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.eduardo.intro_kotlin.R

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val name = intent.extras?.getString("name").orEmpty()
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        tvResultado.text="Hola $name"
    }
}