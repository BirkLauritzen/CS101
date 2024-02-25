package com.example.handin1

fun main() {
    filterWordsByLength()
}


// Exercise 1

fun checkAge() {
    println("What is your age?")
    val age: Int = readln().toInt()
    if (age >= 18) {
        println("You are eligible to vote")
    } else {
        println("You are not old enough to vote")
    }
}

// Exercise 2

fun findMax() {
    return println(maxOf(1, 18, 8))
}

fun findMin() {
    return println(minOf(1, 18, -8))
}

// Exercise 3

fun calculateAverage() {
    val list: List<Int> = listOf(4, 8, 9, 1)
    return println((list).average())
}

// Exercise 4

fun isValidCpr(cpr: Long): Boolean {

    val cprToString = cpr.toString()

    val day = cprToString.substring(0, 2).toInt()
    val month = cprToString.substring(2, 4).toInt()

    if (day < 1 || day > 31) {
        return false
    }
    if (month < 1 || month > 12) {
        return false
    } else {
    return true
    }
}

// Exercise 5

fun fizzBuzz () {
    for (number in 1..100) {
        when {
            number % 15 == 0 -> println("FizzBuzz")
            number % 3 == 0 -> println("Fizz")
            number % 5 == 0 -> println("Buzz")
            else -> println(number)

        }
    }
}

// Exercise 6

fun abbreviationsOfName () {
    println("Write your full name")
    val fullName = readln()
    val splitName  = fullName.split(" ")

    val abbreviation = splitName.dropLast(1).joinToString(" ") { it.take(1) + "." }
    val abbreviationName = "$abbreviation ${splitName.last()}"

    println(abbreviationName)
}

// Exercise 7

fun calculateGrade() {
    println("Enter your grade")
    val userGrade: Int = readln().toInt()

    when {
        userGrade < 60 -> println("F")
        userGrade in 60..69 -> println("D")
        userGrade in 70..79 -> println("C")
        userGrade in 80..89 -> println("B")
        userGrade in 90..100 -> println("A")
    }
}

// Exercise 8

fun filterWordsByLength() {
    println("Write a sentence")
    val sentence = readln()
    println("Write the maximum number of letters in a word")
    val maxLength = readln().toInt()

    val filteredSentence = sentence.split(" ").filter { it.length <= maxLength }.joinToString(" ")

    println(filteredSentence)
}