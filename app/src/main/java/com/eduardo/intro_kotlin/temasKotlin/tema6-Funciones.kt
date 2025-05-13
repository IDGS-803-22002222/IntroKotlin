package com.eduardo.intro_kotlin.temasKotlin

fun sum(x: Int, y: Int): Int{
return  x+y
}

fun sum2(x: Int, y:Int)=x+y


fun main(){
    saludo()
    println("--------------------------------------")
    println(sum(3,5))
    println(sum2(3,5))
}

fun saludo(){
    println("Hola mundo")
}