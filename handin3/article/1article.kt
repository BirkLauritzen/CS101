package com.example.article

class Article (val title: String, val author: String) {
    override fun toString(): String {
        return "\n Title = $title, Author = $author"
    }
}






fun main () {
    val articles = ArrayList<Article>()

    articles.add(Article("Life of Pi", "Yann Martel"))
    articles.add(Article("The Fellowship of the Ring", "J. R. R. Tolkien"))
    articles.add(Article("Harry Potter and the Champer of Secrets", "J. K. Rowling"))
    articles.add(Article("A Game of Thrones", "George R. R. Martin"))
    articles.add(Article("The Odyssey", "Homer"))

    println(articles)
}