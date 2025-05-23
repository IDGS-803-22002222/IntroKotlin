package com.eduardo.intro_kotlin.practica4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.eduardo.intro_kotlin.R
import java.io.FileNotFoundException

class ArchivosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archivos)
        val btnGuardar =  findViewById<Button>(R.id.saveButton)
        val btnLeer =  findViewById<Button>(R.id.readButton)
        val btnBorrar =  findViewById<Button>(R.id.btnBorrar)
        val outputText =  findViewById<TextView>(R.id.outputText)
        val inputText = findViewById<EditText>(R.id.inputText)

        btnGuardar.setOnClickListener {
            val texto = inputText.text.toString() + "\n"
            try {
                openFileOutput("datos.txt", MODE_APPEND).use {
                    it.write(texto.toByteArray())
                }

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnLeer.setOnClickListener {
            try {
                val contenido = openFileInput("datos.txt").bufferedReader().useLines { lines ->
                    lines.joinToString("\n")

                }
                outputText.text = contenido
            } catch (e: Exception) {
                outputText.text = "Error al leer el archivo"
                e.printStackTrace()
            }catch (e: Exception) {
                e.printStackTrace()
            }
        }

        btnBorrar.setOnClickListener {
            try {
                openFileOutput("datos.txt", MODE_PRIVATE).use {
                    it.write("".toByteArray())
                }
                outputText.text = ""
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }




    }
}