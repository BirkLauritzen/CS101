package com.example.handin2

class Employee(firstName: String, lastName: String, var monthlySalary: Double) {
    fun salaryCheck () {
        if (monthlySalary < 0.0) {
            monthlySalary = 0.0
            println("Salary needs to be a number above 0")
        } else {
            println("Salary follows the correct guidelines")
        }
    }
    fun yearlySalary() {
        val yearlySalary = monthlySalary * 12
        println("This is the yearly salary $yearlySalary")
    }
    fun giveRaise(percentage: Double) {
        if (percentage > 0 ) {
            val raise = monthlySalary * (percentage / 100)
            monthlySalary += raise
            val newYearlySalary = monthlySalary * 12
            println("After the raise the new yearly salary is now $newYearlySalary")
        }  else {
            println("Percentage number has to be positive")
        }
    }
}