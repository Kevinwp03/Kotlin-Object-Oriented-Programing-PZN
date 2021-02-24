package app

import data.Person

fun main() {
    val eko = Person()
    eko.firstName = "Kevin"
    eko.middleName = "Williams"
    eko.lastName = "Permana"

    eko.sayHello("Kevin")
    eko.run()
    eko.getFullName2()

    val fullName = eko.getFullName()
    println(fullName)
}