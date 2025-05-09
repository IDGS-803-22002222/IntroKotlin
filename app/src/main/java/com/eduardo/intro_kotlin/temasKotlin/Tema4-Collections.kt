package com.eduardo.intro_kotlin.temasKotlin

fun main(){
    /*
    list            -- val
    MutableList     -- var
    Set
    MutableSet
    Map
    MutableMap

     */

    var lista= listOf<String>("Lunes","Martes","Jueves")
    println(lista)
    println(lista.size)
    println(lista.count())
    println(lista.get(0))
    println(lista[1])
    println(lista.indexOf("Martes"))
    println(lista.first())
    println(lista.last())


    var listaMutable = mutableListOf<String>("Lunes","Martes","Miercoles")
    println(listaMutable)
    listaMutable.add("jueves")
    println(listaMutable)
    listaMutable.removeAt(0)
    println(listaMutable)
    listaMutable.add(0,"Domingo")
    println(listaMutable)
    listaMutable.remove("Miercoles")

}