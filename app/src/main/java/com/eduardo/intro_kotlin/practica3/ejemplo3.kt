package com.eduardo.intro_kotlin.practica3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.eduardo.intro_kotlin.R

class ejemplo3 : AppCompatActivity() {
    private  lateinit var tv1: TextView
    private  lateinit var edt1: EditText
    private  lateinit var button: Button
    private  var num= 0
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplo3)
        edt1=findViewById<EditText>(R.id.ed1)
        num=(Math.random()*100001).toInt()
        val cadena=num.toString()
        val notificacion= Toast.makeText(this,cadena,Toast.LENGTH_LONG)
        notificacion.show()

    }

    fun controlar(view: android.view.View){
        val valorIngresado:String=edt1.text.toString()
        val valor=valorIngresado.toInt()
        if (valor==num){
            val notification= Toast.makeText(this, "Correcto", Toast.LENGTH_LONG)
            notification.show()
        }else{
            val notification= Toast.makeText(this, "Correcto", Toast.LENGTH_LONG)
            notification.show()
        }
    }
}