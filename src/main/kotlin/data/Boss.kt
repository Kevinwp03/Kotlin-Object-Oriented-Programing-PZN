package data

class Boss(val nameBoss: String) {

    // ketika menambahkan inner di class, class tersebut akan menempel pada class utama
    inner class Employee(val name: String) {
        fun hi() {
            println("Hi, My name is $name, My Boss name is ${this@Boss.nameBoss}")
        }
    }
}