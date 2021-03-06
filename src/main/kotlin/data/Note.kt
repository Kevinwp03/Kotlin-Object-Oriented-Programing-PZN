package data

class Note(title: String) {

    var title: String = title

        //Getter
        get() {
            println("Call Getter Function")
            return field // atau bisa diganti title
        }
    set(value){
        println("Call Setter function")
        //validasi
        if (value.isNotBlank()){
            field = value
        }else {
            println("Invalid Title")
        }
    }
}

class BigNote(val title: String){
    val bigTitle: String
    get() = title.toUpperCase()
}

