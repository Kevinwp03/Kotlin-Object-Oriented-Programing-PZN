package data

class Company (val name: String) {

    override fun hashCode(): Int {
        return name.hashCode() // mengambil nilai HashCode dari Nilai Objek
    }
    override fun equals(other: Any?): Boolean {
        return when (other){
            is Company -> other.name == name // maka equal akan membandingkan nilai objek, bukan objeknya
            else -> false
        }
    }
}