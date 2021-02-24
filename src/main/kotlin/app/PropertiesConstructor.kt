package app

import data.User
fun main() {
    val user1 = User("Budi", "Rahasia")

    user1.username = "bambang"

    println(user1.username)
    println(user1.password)
}