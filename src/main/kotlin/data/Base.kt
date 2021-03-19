package data

interface Base {
    fun sayHello(name: String)
    fun sayGoodbay(name: String)
}

class MyBase : Base {
    override fun sayHello(name: String) {
        println("Hello $name")
    }
    override fun sayGoodbay(name: String) {
        println("Goodbye $name")
    }
}

//Delegasi Manual
/*class MyBaseDelagateManual(val base: Base) : Base {
    override fun sayHello(name: String) {
        base.sayHello(name) //delegation patern itu mengimplement code block ini ke parameter class tersebut
    }
    override fun sayGoodbay(name: String) {
        base.sayGoodbay(name)
    }
}
*/

//Delegasi Otomatis
class MyBaseDelegateAuto(val base: Base) : Base by base {
    override fun sayHello(name: String) { //opsional jika ingin mengoverride manual. artinya funtion sayHello tersebut tidak diDelagasi
        println("Hi $name")
    }
}