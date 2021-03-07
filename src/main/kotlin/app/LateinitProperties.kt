package app

import data.Television

fun main() {
    val tv = Television()
//    tv.brand = "Xiaomi"
    tv.initTelevision("Samsung")
    println(tv.brand)
}