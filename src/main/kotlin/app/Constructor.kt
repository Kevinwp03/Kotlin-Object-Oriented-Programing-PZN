package app

import data.Car

fun main() {
    //memakai Secondary Constructor 1
    val toyota = Car("Toyota")

    // Memakai Secondary Constructor 2
    val almaz   = Car("Wuling", "Almaz" )

    println("${toyota.brand} ")
    println(toyota.year)
    println("${almaz.brand} ")
    println(almaz.name)
}