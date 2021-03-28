package app

data class Friend(val name: String)

fun sayHello(friend: Friend?) {
//    println("Hello $friend?.name")
    if (friend != null) {
        println("Hello ${friend.name}")
    }
}
//ElvisOperator
fun brother(friend: Friend?) {
    val name = friend?.name ?: "Bro"
    println("Hello $name")
}
fun sister(friend: Friend?) {
    val name = friend!!.name
    println("Hello $name")
}

fun main() {
    sayHello(Friend("Kevin"))
    sayHello(null)
    brother(null)
    sister(null) //error
}