package com.example.handin2

open class Shape (val color: String, val isTransparent: Boolean) {
    open fun calculatePerimeter () {
        println("I calculate the perimeter")
    }
    open fun calculateArea () {
        println("I calculate the area")
    }
}