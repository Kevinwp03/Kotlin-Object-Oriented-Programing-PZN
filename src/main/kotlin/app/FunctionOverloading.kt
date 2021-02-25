package app

import data.Person
fun main() {

    val kevin = Person()
    kevin.firstName = "Kevin"

    kevin.sayHello("kepin")
    kevin.sayHello("Kevin", "Williams")
}