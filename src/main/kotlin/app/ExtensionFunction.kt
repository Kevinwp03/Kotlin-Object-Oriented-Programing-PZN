package app

import data.Student
import data.sayHello
import data.upperName

fun main() {
    val student = Student("Kevin", 18)
    student.sayHello("Bro!")
    //Extension Properties
    println(student.upperName)

}