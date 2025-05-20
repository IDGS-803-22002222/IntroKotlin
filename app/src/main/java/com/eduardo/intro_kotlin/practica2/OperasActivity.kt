package com.eduardo.intro_kotlin.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.eduardo.intro_kotlin.R

class OperasActivity : AppCompatActivity() {
    private lateinit var edt1:EditText
    private lateinit var edt2:EditText
    private lateinit var btn1:Button
    private lateinit var tv1:TextView
    private lateinit var radioGroup: RadioGroup
    private lateinit var rSuma: RadioButton
    private lateinit var rResta: RadioButton
    private lateinit var rMultiplicacion: RadioButton
    private lateinit var rDivision: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operas)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        btn1 = findViewById(R.id.btn1)
        tv1 = findViewById(R.id.tv1)
        radioGroup = findViewById(R.id.grupo1)
        rSuma = findViewById(R.id.rSuma)
        rResta = findViewById(R.id.rResta)
        rMultiplicacion = findViewById(R.id.rMultiplicacion)
        rDivision = findViewById(R.id.rDivision)


    }

    fun calcular(view: android.view.View){
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()

        val suma = num1+num2

        val result1 = "Resultado: $suma"
        tv1.text=result1

    }
    fun calcular2(view: android.view.View) {
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        var resultado  = 0.0

        when (radioGroup.checkedRadioButtonId) {
            R.id.rSuma -> resultado = num1 + num2
            R.id.rResta -> resultado = num1 - num2
            R.id.rMultiplicacion -> resultado = num1 * num2
            R.id.rDivision -> {
                if (num2 != 0.0) {
                    resultado = num1 / num2
                } else {
                    tv1.text = "No se puede dividir entre 0"
                    return
                }
            }
        }

        val resultText = if (resultado % 1 == 0.0) {
            "Resultado: ${resultado.toInt()}"
        } else {
            "Resultado: $resultado"
        }

        tv1.text = resultText
    }

}