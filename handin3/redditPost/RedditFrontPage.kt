package com.example.redditPost

class RedditFrontPage {
    private val posts: MutableList<RedditPost> = mutableListOf()

    fun addPost(post: RedditPost) {
        posts.add(post)
    }

    fun deletePost(index: Int) {
        if (index >= 0 && index < posts.size) {
            posts.removeAt(index)
            } else {
            println("This post $index does not exist")
            }
        }

    fun printPosts() {
        posts.forEachIndexed {index, post ->
            println("Index $index: ${post.getTitle()} by ${post.getAuthor()}, Votes: ${post.getTotalVotes()}")
        }
    }
}