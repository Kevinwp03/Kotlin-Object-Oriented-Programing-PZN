package app

import data.Game
import data.MinMax

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

fun main() {
    val game = Game("Game Kotlin", 100000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)

    //Destructuring di Function
//    val result = minmax(100, 10)
//    val min = result.min
//    val max = result.max

    val (min, _) = minmax(10, 100)
    println(min)
//    println(max)
}