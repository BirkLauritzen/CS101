package com.example.fastfood

open class Burger: FastFood {
    override fun prepareOrder() {
        println("Preparing burger")
    }

    override fun serveOrder() {
        println("Serving burger")
    }
}