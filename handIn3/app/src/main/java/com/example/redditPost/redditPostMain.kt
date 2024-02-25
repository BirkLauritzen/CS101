package com.example.redditPost

import java.text.SimpleDateFormat
import java.util.Locale

fun main () {
    val posts = listOf(
        RedditPost("First post", "Birk").apply { setTotalVotes(4) },
        RedditPost("Second post", "Sofie").apply { setTotalVotes(9) },
        RedditPost("Third post", "Lucas").apply { setTotalVotes(7) }
    )

    val sortedPosts = posts.sortedByDescending { it.getTotalVotes() }

    val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())

    sortedPosts.forEach { post ->
        val formattedDate = dateFormat.format(post.getDatePosted())
        println("${post.getTitle()} by ${post.getAuthor()}, Total votes: ${post.getTotalVotes()}, Posted on: $formattedDate")
    }
    println("\n ----- \n")

    val frontPage = RedditFrontPage()
    frontPage.addPost(RedditPost("Bigfoot post", "bigfootguy123").apply { setTotalVotes(123) })
    frontPage.addPost(RedditPost("Government conspiracy", "tinfoilman7").apply { setTotalVotes(-77) })
    frontPage.addPost(RedditPost("Best kebab in Copenhagen", "iLikeFood420").apply { setTotalVotes(85) })

    println("Frontpage overview: \n")
    frontPage.printPosts()

    frontPage.deletePost(1)

    println("\n----Post has been deleted----\n")

    println("Frontpage overview: \n")
    frontPage.printPosts()
}