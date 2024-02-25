package com.example.vehicle

interface Vehicle {
    fun changeGear(shift: Int)
    fun speedUp(faster: Int)
    fun applyBrakes(slower: Int)
}