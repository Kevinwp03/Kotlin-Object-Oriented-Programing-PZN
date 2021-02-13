package app

import data.Car

fun main() {
    val toyota = Car("Toyota")
    val almaz   = Car("Almaz", 2010)

    print("${toyota.brand} ")
    println(toyota.year)
    print("${almaz.brand} ")
    println(almaz.year)
}