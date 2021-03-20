package data

import kotlin.properties.Delegates

class Account(description: String = "null") {
    val name: String by lazy{ // Lamda ini di callnya hanya sekali saja, dan nilai lambdanya akan di asign di properties
        //dibawah ini adalah objec delagation objectnya lazy
        println("Name is called")
        "Eko"
    }
//Observable Description
    var description: String by Delegates.observable(description){ // harus var
        property, oldValue, newValue ->
        println("${property.name} is changed from $oldValue to $newValue")
    }
}