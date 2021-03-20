package data

class Account {
    val name: String by lazy{ // Lamda ini di callnya hanya sekali saja, dan nilai lambdanya akan di asign di properties
        //dibawah ini adalah objec delagation objectnya lazy
        println("Name is called")
        "Eko"
    }
}