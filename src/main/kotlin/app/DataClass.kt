package app

import data.Product

fun main() {
    val product = Product("Indomie", 2500, "Food")

    val product2 = product.copy(name ="Supermi", price = 1500, )
    println(product)
    println(product2)
}