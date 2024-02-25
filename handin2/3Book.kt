package com.example.handin2

class Book (name: String, price: Int, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a book")
    }
}
