package data

import annotation.NotBlank

data class CreateProductRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
    @NotBlank val price: Long //bagian ini sebenarnya bisa di ignore karena tipe datanya berbeda dengan yang lain
)

data class CreateCategoryRequest(
    @NotBlank val id: String,
    @NotBlank val name: String,
)