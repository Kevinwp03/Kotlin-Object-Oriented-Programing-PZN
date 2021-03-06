package app

import data.City
import data.Country
import data.Location

fun main() {
    // val location = Location("Jakarta") // Error
    val city = City ("Jakarta")
    val country = Country("Indonesia")

    println("City = ${city.name} \n Country = ${country.name}")
}