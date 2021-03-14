package app

import data.Boss
import data.Employee

fun main() {
//    val employee = Boss.Employee("Kevin)
    //Membuat Object dari inner class
    val boss = Boss("Kevin")
    val employee1 = boss.Employee("Joko")
    val employee2 = boss.Employee("budi")

    val boss2 = Boss("Ucok")
    val employee3 = boss2.Employee("Joko")
    val employee4 = boss2.Employee("budi")

    employee1.hi()
    employee2.hi()
    employee3.hi()
    employee4.hi()
}