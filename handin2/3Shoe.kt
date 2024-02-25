package com.example.handin2

class Shoe (name: String, price: Int, quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory() {
        println("I am a shoe")
    }
}
