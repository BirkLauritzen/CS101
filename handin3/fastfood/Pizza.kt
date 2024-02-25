package com.example.fastfood

open class Pizza: FastFood {
    override fun prepareOrder() {
        println("Preparing pizza")
    }

    override fun serveOrder() {
        println("Serving pizza")
    }
}