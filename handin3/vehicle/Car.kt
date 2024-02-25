package com.example.vehicle

class Car: Vehicle {
    var speed: Int = 0
    var gear: Int = 1

    override fun changeGear(shift: Int) {
        this.gear = shift
        println("Gear shifted to $shift")
    }

    override fun speedUp(faster: Int) {
        speed += faster
        println("Speed increased to $faster")
    }

    override fun applyBrakes(slower: Int) {
        speed -= slower
        println("Speed decreased to $slower")
    }
}