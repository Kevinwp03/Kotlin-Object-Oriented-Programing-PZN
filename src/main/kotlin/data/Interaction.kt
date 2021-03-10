package data

// semua bersifat open
interface Interaction {
    val name: String // properties
    fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}

interface Go: Interaction{
    fun go(){
        println("Go!")
    }
}

class Human(override val name: String): Go