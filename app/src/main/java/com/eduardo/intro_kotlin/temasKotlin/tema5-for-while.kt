package com.eduardo.intro_kotlin.temasKotlin

fun main(){
    /*
    range
    1 .. 4 = 1 2 3 4
    1 ..<4 = 1 2 3
    4 downto 1 = 4 3 2 1
    1..5 step 2 = 1 3 5
    'a' .. 'z'
     */

    for (num in 1..5) {
        println(num)
    }

    val frutas = listOf<String>("Pera","Manzana","Sandia")
        for (fruta in frutas){
            println(fruta)
        }
    val n=10
    var d=0
    while (d<n){
        println(d)
        d++
    }

    /*
    practica 3 = imprimir una piramite de * segun el numero dado el usuario
    n=5
    *
    **
    ***
    ****
    *****
    cuando se capture 0 terminar el programa, utilizando do while
    practica 3:formula general preguntar las 3 letras
     */


}