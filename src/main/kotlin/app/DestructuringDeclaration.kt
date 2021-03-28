package app

import data.Game
import data.Login
import data.MinMax

fun minmax(value1: Int, value2: Int): MinMax {
    return when {
        value1 > value2 -> MinMax(value1, value2)
        else -> MinMax(value1, value2)
    }
}

typealias loginCallback = (Login) -> Boolean

fun login(login: Login, callback: loginCallback): Boolean {
    return callback(login)
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

    //Destructuring Lambda Parameter
    val login = Login("Kevin", "Secret")
//    login(login){ login ->
//        login.username == "Kevin" && login.password == "Secret"
//    }
    val success = login(login) { (username, password) ->
        username == "Kevin" && password == "Secret"
    }
    println(success)
}