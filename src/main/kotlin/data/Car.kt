package data

class Car ( paramBrand: String, paramName: String, paramYear: Int = 2021){

    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) : this (paramBrand, paramName,1010){
        println("Secondary Construction 1 ")
    }

    constructor(paramName: String): this (paramName, ""){
        println("Secondary Construction 2 ")
    }

    var brand   : String = paramBrand
    var name    : String = paramName
    var year    : Int = paramYear
}