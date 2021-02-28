package data

open class Employee (val name: String){ // parameternya di ubah menjadi properties karena ada val
    open fun sayHello(name: String){
        println("Hello $name, My Name Is ${this.name}")
    }
}

open class Manager(name: String): Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, My Name Is Manager ${this.name}")
    }
}

class SuperManager (name: String): Manager(name){ // Manajer(name) adalah Parent
    //ERROR
//    override fun sayHello(name: String) {
//       println("Hello $name, My Name Is Super Manager ${this.name}")
//   }
}

class VicePresident(name: String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, My Name is VicePresident ${this.name}")
    }
}