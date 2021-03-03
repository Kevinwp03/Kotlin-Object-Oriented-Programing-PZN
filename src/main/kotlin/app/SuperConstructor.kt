package app

import data.ExecutiveConstructor
import data.PremiumConstructor

fun main() {
    val premiumConstructor = PremiumConstructor("Kevin", 10_000)
    println(premiumConstructor.name)
    println(premiumConstructor.balance)

    val executiveConstructor = ExecutiveConstructor("Dian", 1_000_000)
    println(executiveConstructor.name)
    println(executiveConstructor.balance)
}