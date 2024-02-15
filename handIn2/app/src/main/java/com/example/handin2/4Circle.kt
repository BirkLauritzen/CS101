package com.example.handin2

class Circle (private val radius: Int, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculateArea() {
        println(3.14*radius*radius)
    }

    override fun calculatePerimeter() {
        println(2*3.14*radius)
    }
}