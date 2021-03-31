package annotation

@Target(AnnotationTarget.CLASS) //hnya bisa ditambahkan di class
@Retention(AnnotationRetention.RUNTIME) // ada 3 pilihan
@MustBeDocumented
annotation class Fancy(val author: String)
// tidak bisa ditambahkan function atau properties body
