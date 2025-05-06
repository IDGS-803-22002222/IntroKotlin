package com.eduardo.intro_kotlin.temasKotlin

fun main(){
    var opcion=0
    do{
        println("1-Suma")
        println("2-Resta")
        println("3-Multiplicacion")
        println("4-Division")
        println("5-Salir")
        opcion = readln().toInt()

        if (opcion==1){
            println("Suma")
            println("Ingresa la cantidad primera")
            var n1 = readln().toDouble()
            println("Ingresa la cantidad segunda")
            var n2 = readln().toDouble()
            var resultado = n1+n2
            println("Resultado de la suma es "+  resultado)
        }
        if (opcion==2){
            println("Resta")
            println("Ingresa la cantidad primera")
            var n1 = readln().toDouble()
            println("Ingresa la cantidad segunda")
            var n2 = readln().toDouble()
            var resultado = n1-n2
            println("Resultado de la resta es "+  resultado)

        }
        if (opcion==3){
            println("multiplicacion")
            println("Ingresa la cantidad primera")
            var n1 = readln().toDouble()
            println("Ingresa la cantidad segunda")
            var n2 = readln().toDouble()
            var resultado = n1*n2
            println("Resultado de la multiplicacion es "+  resultado)

        }
        if (opcion==4){
            println("Division")
            println("Ingresa la cantidad primera")
            var n1 = readln().toDouble()
            println("Ingresa la cantidad segunda")
            var n2 = readln().toDouble()

            if(n2 == 0.0){
                println("No se puede dividir entre 0")
            }else{
                var resultado = n1/n2
                println("Resultado de la resta es "+  resultado)
            }

        }
        if(opcion==5){
            println("bay")
        }


    }while (opcion!=5)
}