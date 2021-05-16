package app

import data.Employee
import data.Manager
import data.VicePresident

fun main() {
    var employee = Employee("Kevin")
    employee.sayHello("Eko")

    employee = Manager("Kevin")
    employee.sayHello("Eko")

    employee = VicePresident("Kevin")
    employee.sayHello("Eko")
}