package app

import data.Person
fun main() {

    val kevin = Person()
    kevin.firstName = "Dian"

    kevin.sayHello("kepin")
    kevin.sayHello("Kevin", "Williams")
}