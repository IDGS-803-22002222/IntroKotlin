package com.eduardo.intro_kotlin.temasKotlin

fun main(){
    println("Ingresa el sueldo del mai")
    val sueldo= readln().toDouble()

    if (sueldo>3000){
        println("Debe pagar impuestos")
    }else{
        println("No debe de pagar inpuestos")
    }




    val mes="1"
    when(mes){
        "1" -> println("enero")
        "2" -> println("febrero")

    }

}