package com.example.handin2

class Smartphone(color: String, cpuCores: Int, internalGpu: Boolean, storage: Int) : Computer(cpuCores, internalGpu, storage) {
    override fun powerOn() {
        println("Smartphone has been turned on")
    }

    override fun powerOff() {
        println("Smartphone has been turned off")
    }
    fun notification() {
        println("You have just received a notification")
    }
}