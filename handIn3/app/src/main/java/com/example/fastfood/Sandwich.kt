package com.example.fastfood

open class Sandwich: FastFood {
    override fun prepareOrder() {
        println("Preparing sandwich")
    }

    override fun serveOrder() {
        println("Serving sandwich")
    }
}