package app

import data.Game

fun main() {
    val game = Game("Game Kotlin", 100000)
//    val name = game.name
//    val price = game.price
    val (name, price) = game
    println(name)
    println(price)
}