package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FAMALE
    val allGender: Array<Gender> = Gender.values()

    val manFromString = Gender.valueOf("MALE")
    val womanFromString = Gender.valueOf("FAMALE")

    println(man)
    println(woman)
    println(allGender.toList())

    man.showDescription()
    woman.showDescription()
}