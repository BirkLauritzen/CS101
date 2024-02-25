package com.example.redditPost

import java.util.Date

open class RedditPost(private val title: String, private val author: String): Comparable<RedditPost> {
    private val datePosted: Date = Date()
    private var totalVotes: Int = 1

    fun getTitle() = title
    fun getAuthor() = author
    fun getDatePosted() = datePosted
    fun getTotalVotes() = totalVotes

    fun setTotalVotes(balance: Int) {
        this.totalVotes = balance
    }

    override fun compareTo(other: RedditPost): Int {
        return this.totalVotes.compareTo(other.totalVotes)
    }

    fun upvote() {
        totalVotes++
    }

    fun downvote() {
        totalVotes--
    }

}