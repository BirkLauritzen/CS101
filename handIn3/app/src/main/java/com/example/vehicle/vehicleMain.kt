package com.example.vehicle

fun main () {
    val car1 = Car()
    car1.speedUp(50)
    car1.changeGear(4)
    car1.applyBrakes(10)

    println("\n")

    val car2 = Car()
    car2.speedUp(30)
    car2.changeGear(2)
    car2.applyBrakes(5)
}