package app

import data.Student

fun main() {
    val student = Student("Kevin", 18)
    println(student.name)
    println(student.age)

    // Let
    student.let {
        println(it.name)
        println(it.age)
        "Eko"
    }

    val result : String = student.let {
        "Name is ${it.name}, age ${it.age}"
    }
    println(result)

    //Run
    val result2 : String= student.run {
        "Name is ${this.name}, age ${this.age}"
    }
    println(result2)

    // Apply
    val result3 : Student = student.apply {
        "Name is ${this.name}, age ${this.age}"
    }
    println(result3)

    //Also
    val result4 : Student = student.also {
        "Name is ${it.name}, age ${it.age}"
    }
    println(result4)

    //With
    val result5: String = with(student){
        "Name is ${this.name}, age ${this.age}"
    }
    println(result5)

}