package com.example.handin2

class Laptop (material: String, cpuCores: Int, internalGpu: Boolean, storage: Int) : Computer(cpuCores, internalGpu, storage) {
    override fun powerOn() {
        println("Laptop has been turned on")
    }

    override fun powerOff() {
        println("Laptop has been turned off")
    }
    fun powerSaver() {
        println("Laptop power saver has been turned on ")
    }
}