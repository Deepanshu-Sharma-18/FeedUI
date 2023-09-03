package com.example.feedapp.models

data class Comment(
    val account: Account,
    val feedText: String,
    val likes: Int,
)
