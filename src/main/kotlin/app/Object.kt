package app

import data.Person

fun main() {
    // untuk memmanggil function, cukup memanggil classnya saja
    val kevin = Person()
    kevin.firstName     = "Kevin"
    kevin.middleName    = "Williams"
    kevin.lastName      = "Permana"

    val joko = Person()
    joko.firstName = "Joko"

    val budi = Person()
    budi.firstName = "Budi"

    println(kevin.middleName)
    println(joko.firstName)
    println(budi.firstName)
}