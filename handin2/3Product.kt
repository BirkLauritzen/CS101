package com.example.handin2

open class Product (val name: String, val price: Int, val quantity: Int) {
    open fun identifyProductCategory () {
        println("I am a product")
    }
}
