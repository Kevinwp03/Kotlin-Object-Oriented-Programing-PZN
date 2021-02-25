package data

class Person {
    var firstName   : String = ""
    var middleName  : String? = null
    var lastName    : String = ""

    fun sayHello(name: String):Unit{
        println("Hello $name, my name in $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String):Unit { //Unit adalah Return Valuenya
        println("My Name is $firstNameParam $lastNameParam, You can call me $firstName")
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