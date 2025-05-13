package com.eduardo.intro_kotlin.temasKotlin

class Usuarios() {
    val materia:String=""

}

class Usuarios2(val id:Int, val nombre:String) {
    val materia:String=""
        fun hola(){
            println("Hola a aquellota")
        }
}

fun main(){
    val alumno = Usuarios()
    val alumno2= Usuarios2(1,"Carlos")

    println(alumno2.id)
    println(alumno2.nombre)
    alumno2.hola()
}