package data

open class Employee (val name: String){ // parameternya di ubah menjadi properties karena ada val
    fun sayHello(name: String){
        println("Hello $name, My Name Is ${this.name}")
    }
}

class Manager(name: String): Employee(name)

class VicePresident(name: String) : Employee(name)