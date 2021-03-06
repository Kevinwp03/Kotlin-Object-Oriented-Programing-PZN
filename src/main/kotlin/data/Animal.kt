package data

abstract class Animal {
    abstract val name: String //Properties/Atribute
    abstract fun run():Unit
}

class Cat(): Animal() {
    override val name: String = "Cat"
    override fun run(){
        println("$name Run!")
    }
}

class Dog(): Animal(){
    override val name: String = "Dog"
    override fun run(){
        println("$name Run!")
    }
}