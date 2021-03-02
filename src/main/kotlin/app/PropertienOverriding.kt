package app

import data.Retangel
import data.Shape
import data.Triangel

fun main() {
    val shape1 = Shape()
    println(shape1.corner)

    val shape2 = Retangel()
    println(shape2.corner)

    val shape3 = Triangel()
    println(shape3.corner)
}