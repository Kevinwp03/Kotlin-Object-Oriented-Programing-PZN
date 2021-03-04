package app

import data.Handphone
import data.Laptop
import data.Smartphone

fun printObject(any: Any) { //karena parameternya Any, kita bisa menerima tipe data dalam bentuk apapun
    if (any is Laptop) { // any sudah berubah menjadi Laptop
        println("Laptop with name ${any.name}")
    } else if (any is Smartphone) {
        println("HandPhone with name ${any.name} and os ${any.os}")
    } else {
        println(any)
    }
}

fun printObjectWithWhen(any: Any) {
    when (any) {
        is Laptop -> println("Laptop with name ${any.name}")
        is Smartphone -> println("HandPhone with name ${any.name} and os ${any.os}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}
fun main() {
    printString("Eko")
    // printString(1) //ClassCastExeption

    printStringSafe("Bambang")
    printStringSafe(2)// Output : Null

    printObject("Kevin")
    printObject(1)
    printObject(Laptop("Asus"))
    printObject(Smartphone("Iphone 6s", "IOS"))

    printObjectWithWhen(Laptop("Xiaomi"))
}