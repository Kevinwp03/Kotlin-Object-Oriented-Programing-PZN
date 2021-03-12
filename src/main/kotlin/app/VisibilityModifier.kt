package app

import data.SuperTeacher

fun main() {
    val teacher = SuperTeacher("Kevin")
    println(teacher.name)
//    println(teacher.teach()) //erorr
    teacher.test()
}