package com.example.handin2

class Triangle (private val height: Int, private val base: Int, private val a: Int, private val b: Int, private val c: Int, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculateArea() {
        println(0.5*base*height)
    }

    override fun calculatePerimeter() {
        println(a+b+c)
    }
}