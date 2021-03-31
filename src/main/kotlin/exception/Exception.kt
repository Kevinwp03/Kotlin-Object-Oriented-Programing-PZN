package app

import data.ValidationException

fun validateAndSayHello(name: String){
    if(name.isBlank()){
        throw ValidationException("Name is Blank")
    } else{
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Kevin")
        validateAndSayHello("")
        println("Program")
    } catch (error: ValidationException){
        println("Terjadi Error ${error.message}")
    } catch (error: Throwable){
        println("Terjadi Error ${error.message}")
    } finally {
        println("Program Selesai")
    }
}