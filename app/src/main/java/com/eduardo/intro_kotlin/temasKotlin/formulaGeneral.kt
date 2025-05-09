package com.eduardo.intro_kotlin.temasKotlin

import kotlin.math.sqrt

import kotlin.math.sqrt

fun main() {
    var es = false

    while (!es) {
        print("A: ")
        val a = readLine()!!.toDouble()
        print("B: ")
        val b = readLine()!!.toDouble()
        print("C: ")
        val c = readLine()!!.toDouble()

        val discriminante = b * b - 4 * a * c

        if (discriminante < 0) {
            println("No hay solución real. Intenta de nuevo.")
        } else {
            val xuno = (-(b) + sqrt(discriminante)) / (2 * a)
            val xdos = (-(b) - sqrt(discriminante)) / (2 * a)
            println("Soluciones: x1 = "+xuno+" y x2 = "+xdos)
            es = true
        }
    }
}

