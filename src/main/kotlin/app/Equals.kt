package app

import data.Company

fun main() {
    val company1 = Company("Kevin")
    val company2 = Company("Kevin")

    println(company1 == company2) // true
    println(company1 == company1) // true
    println(company2 == company2) // true
}