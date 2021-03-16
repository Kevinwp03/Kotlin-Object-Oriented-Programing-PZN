package data

enum class Gender (val description: String) {
    MALE("Male"),
    FAMALE("Famale");

    fun showDescription(){
        println(description)
    }
}