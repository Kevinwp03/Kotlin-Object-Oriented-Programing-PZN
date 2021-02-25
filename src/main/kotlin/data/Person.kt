package data

class Person {
    var firstName   : String = ""
    var middleName  : String? = null
    var lastName    : String = ""

    fun sayHello(name: String):Unit{
        println("Hello $name, my name in $firstName")
    }

    fun sayHello(firstName: String, lastName: String):Unit { //Unit adalah Return Valuenya
        println("My Name is $firstName $lastName, My name is ${this.firstName}")
    }

    fun run(){
        println("I'm run")
    }

    fun getFullName():String{
        return "$firstName $middleName $lastName"
    }

    fun getFullName2():Unit{
        println("$firstName $middleName $lastName ")
    }
}