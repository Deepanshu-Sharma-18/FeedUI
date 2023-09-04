package com.example.feedapp.data.models

data class Comment(
    val account: Account,
    val feedText: String,
    val likes: Int,
)
