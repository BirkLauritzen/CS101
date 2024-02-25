package com.example.fastfood

fun main () {
    val fastFoods = arrayOf<FastFood>(
        Burger(),
        Pizza(),
        Sandwich()
    )

    fastFoods.forEach { item ->
        item.prepareOrder()
        item.serveOrder()
        println("\n")
    }
}