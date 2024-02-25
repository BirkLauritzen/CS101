package com.example.words

fun main () {
    val words = listOf("apple", "banana", "apple", "orange", "banana", "apple", "orange", "banana", "apple","banana", "apple", "orange", "banana","banana", "apple", "orange", "apple", "orange", "banana")

    val wordFrequency: MutableMap<String, Int> = mutableMapOf()

    for (word in words) {
        if (word in wordFrequency) {
            wordFrequency[word] = wordFrequency[word]!! + 1
        } else {
            wordFrequency[word] = 1
        }
    }

    for ((word, count) in wordFrequency) {
        println("$word: $count")
    }

}