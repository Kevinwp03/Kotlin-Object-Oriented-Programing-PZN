package Program

import annotation.Fancy

@Fancy("Kevin")
class MyApplication (val name: String, val version: Int){

    fun info(): String = "Application $name-$version"
}