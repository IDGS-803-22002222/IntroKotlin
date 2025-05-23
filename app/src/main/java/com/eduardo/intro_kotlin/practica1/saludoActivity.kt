package com.eduardo.intro_kotlin.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.eduardo.intro_kotlin.R

class saludoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)
        val btnStart = findViewById<Button>(R.id.button)
        val edtName = findViewById<EditText>(R.id.edtName)

        btnStart.setOnClickListener {
            val name = edtName.text.toString()
            if ( name.isNotEmpty()){
                val intent = Intent(this, resultado::class.java)
                intent.putExtra("name",name)
                startActivity(intent)
            }

        }
    }
}