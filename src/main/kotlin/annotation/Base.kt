package annotation

@Target(
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.FIELD
)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Base()

class ExampleTarget(
    //merubah lokasi
    @field:Base val firstname: String,
    @get:Base val middlename: String,
    @param:Base val lastName: String
)
