package data

class Address {
    //harus ada Defaul value
    var street  : String = ""
    var city    : String = ""
    var country : String = ""

    constructor(paramStreet: String, paramCity: String) {
        street  = paramStreet
        city    = paramCity
    }

    constructor(paramStreet: String,paramCity: String, paramCountry:String)
            : this(paramStreet, paramCity) {
        // street dan city tidak perlu di panggil karena sudah di set
                country = paramCountry
            }
}