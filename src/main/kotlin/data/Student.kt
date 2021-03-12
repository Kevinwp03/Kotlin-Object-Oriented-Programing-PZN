package data

class Student(val name: String, val age: Int)

fun Student.sayHello(name: String){ // hanya bisa akses public tidak bisa private/protected
    println("Hello $name, My name is ${this.name} and my age is ${this.age}")
}