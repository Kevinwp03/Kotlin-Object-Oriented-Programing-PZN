package app

import data.Manager
import data.VicePresident

fun main() {
    val manager = Manager("Kevin")
    manager.sayHello("Joko")

    val vicePresident = VicePresident("Widodo")
    vicePresident.sayHello("Josep")
}