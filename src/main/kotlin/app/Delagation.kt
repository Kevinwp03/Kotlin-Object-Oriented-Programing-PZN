package app

import data.MyBase
import data.MyBaseDelegateAuto

fun main() {
    val base = MyBase()
    base.sayHello("Kevin")
    base.sayGoodbay("Bambang")

    val baseDelegate = MyBaseDelegateAuto(base) //object base adalah sebagai object yang menerima delegasi tugas dari baseDelegate
    baseDelegate.sayHello("Eko")
    baseDelegate.sayGoodbay("Ucup")
}