package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operationInt(value1 : Int, value2: Int, operation: Operation): Int{
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}

fun main() {

    println(operationInt(10, 10, Plus()))
    println(operationInt(10, 5, Minus()))
    println(operationInt(10, 3, Modulo()))
}