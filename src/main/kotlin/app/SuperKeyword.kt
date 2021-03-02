package app

import data.Retangel
import data.Triangel

fun main() {
    // Super Properties
    val superProperties = Triangel()
    println("This is Corner Retangle -> ${superProperties.corner}")
    println("This is Parent Corner Retangle -> ${superProperties.parentCorner}")

    // Super Function
    val superFunction = Retangel()
    superFunction.printName()
}