package com.example.handin2

class Rectangle (private val height: Int, private val width: Int, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculateArea() {
        println(height*width)
    }

    override fun calculatePerimeter() {
        println(2*(height+width))
    }
}