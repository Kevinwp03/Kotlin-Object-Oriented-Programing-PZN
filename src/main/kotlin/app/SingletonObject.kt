package app

import data.Application
import data.Utilities

fun main() {
    //Singelton Object
    Utilities.name = "Berubah"
    println(Utilities.toUpper("Kevin"))
    a() // output : Berubah
    b() // output : Berubah

    //Inner object
    println(Application.Utilities.toUpper("Williams"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}

