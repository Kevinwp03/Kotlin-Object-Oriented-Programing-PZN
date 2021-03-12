package data

//open      == bisa di akses di manapun
//private   == Hanya bisa di akses di tempat deklarasinya
//protected == Hanya bisa di akses di tempat deklarasi, dan juga turunannya
//internal  == Hanya bisa di akses di module/project yang sama

open class Teacher (val name: String) {
    private fun teach(){ //hanya bisa dipanggil dalam class ini
        println("Teach!")
    }

    protected open fun test(){ // Harus diturunkan(override), baru bisa di panggil
        println("Test")
    }
}

class SuperTeacher(name: String): Teacher(name){
    public override fun test(){
        super.test()
    }
}