package com.example.handin2

open class Computer (val cpuCores: Int, val internalGpu: Boolean, val storage: Int) {
    open fun powerOn () {
        println("Device has been turned on")
    }
    open fun powerOff () {
        println("Device has been turned off")
    }
}