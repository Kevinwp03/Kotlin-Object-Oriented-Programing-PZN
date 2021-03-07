package data

class Television {
    lateinit var brand: String // tidak boleh ada nilai

    fun initTelevision(brand: String){
        this.brand = brand
    }
}