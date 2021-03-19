package app

import data.Token

fun main() {
    val token = Token("ini Token")
    println(token.value)
    println(token.toUpper())
}