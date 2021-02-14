package app

import data.Address

fun main() {

    val address1 = Address("Jalan A", "Bandung")
    val address2 = Address("Jalan B", "Jakarta", "Indonesia")

    println(address1.street)
    println(address2.street)
}