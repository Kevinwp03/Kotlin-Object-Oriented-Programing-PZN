package app

import annotation.NotBlank
import data.CreateCategoryRequest
import data.CreateProductRequest
import data.ValidationException
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties


fun validationRequest(request: Any) {
    val clazz = request::class
    val properties = clazz.memberProperties


    //iterate satu", lalu cek kalo ada annotation @NotBlank
    for(property in properties){
        if(property.findAnnotation<NotBlank>() != null){
            val value = property.call(request)
//            if ("" == value){
//                throw ValidationException(" ${property.name} is blank")
//            }
            when(value){
                is String -> {
                    if(value == ""){
                        throw ValidationException("${property.name} is Blank")
                    }
                }
            }
        }
    }
}

fun main() {
    val request = CreateProductRequest("1", "Indomie", 2000)
    validationRequest(request)

    val request2 = CreateCategoryRequest("2", "Sedap")
    validationRequest(request2)
}

