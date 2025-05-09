package com.eduardo.intro_kotlin.temasKotlin

fun main(){
    var opcion = 0

    do {
        println("Numero")
        opcion = readln().toInt()

        if (opcion == 0) {
            println("bay")
        } else {
            var altura = 1
            do {
                var j = 1
                do {
                    print("*")
                    j++
                } while (j <= altura)
                println()
                altura++
            } while (altura <= opcion)
        }
    } while (opcion != 0)

}