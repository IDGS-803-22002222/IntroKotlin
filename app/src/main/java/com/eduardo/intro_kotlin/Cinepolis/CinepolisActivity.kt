package com.eduardo.intro_kotlin.Cinepolis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import com.eduardo.intro_kotlin.R

class CinepolisActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etCantidadCompradores: EditText
    private lateinit var rbSi: RadioButton
    private lateinit var etCantidadBoletos: EditText
    private lateinit var rgTarjetaCineco: RadioGroup
    private lateinit var tvTotalPagar: TextView
    private lateinit var btnCalcular: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinepolis)

        etNombre = findViewById(R.id.etNombre)
        rgTarjetaCineco = findViewById(R.id.rgTarjetaCineco)
        etCantidadCompradores = findViewById(R.id.etCantidadCompradores)
        rbSi = findViewById(R.id.rbSi)
        etCantidadBoletos = findViewById(R.id.etCantidadBoletos)
        tvTotalPagar = findViewById(R.id.tvTotalPagar)
        btnCalcular = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            calcularTotal()
        }
    }

    private fun calcularTotal() {
        val nombre = etNombre.text.toString()
        val cantidadCompradores = etCantidadCompradores.text.toString().toInt()
        val cantidadBoletos = etCantidadBoletos.text.toString().toInt()
        val tieneTarjeta = rgTarjetaCineco.checkedRadioButtonId == R.id.rbSi

        val maxBoletos = cantidadCompradores * 7
        if (cantidadBoletos > maxBoletos) {
            tvTotalPagar.text = "maximo $maxBoletos boletos para $cantidadCompradores personas"

        }
        val precioBoleto = 12.0
        var total = cantidadBoletos * precioBoleto

        if (cantidadBoletos > 5) {
            total = total - (total * 0.15)
        } else if (cantidadBoletos >= 3 && cantidadBoletos <= 5) {
            total = total - (total * 0.10)
        }

        if (tieneTarjeta) {
            total = total - (total * 0.10)
        }



        tvTotalPagar.text = "$nombre, total a pagar: $${"%.2f".format(total)}"
    }


}