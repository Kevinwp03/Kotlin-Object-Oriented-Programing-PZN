package data

open class Shape {
    open val corner: Int = -1
    open fun printName(){
        println("This is Shape")
    }
}
open class Retangel : Shape(){
    override val corner: Int = 4 // otomatis final
    override fun printName(){
        println("This is Retangel")
        super.printName()
    }
}
class Triangel :Retangel(){
    override val corner: Int = 3
    val parentCorner = super.corner
}


