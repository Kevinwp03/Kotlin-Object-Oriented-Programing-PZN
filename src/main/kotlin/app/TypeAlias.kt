package app

import data.Application

typealias App = Application
typealias aplikasi = App
typealias App2 = data2.Application
// typeAlias for Function
typealias StringSupplier = () -> String

fun sayHello(supplier:  StringSupplier/*() -> String*/) = println("Hello ${supplier()}")

fun main() {
    val app = App("Kotlin app")
    val aplikasi = aplikasi("Aplikasi Koltin")
    val app2 = App2("Kotlin App v2")

    println(app)
    println(aplikasi)
    println(app2)
    sayHello { "Kevin" }
}