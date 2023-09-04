package com.example.feedapp.data.models

data class Feed(
    val account: Account,
    val feedText: String,
    val likes: Int,
    val comCount: Int,
    val postType: String,
    val images: List<String?> = listOf(),
    val video: String? = null,
    val comments: List<Comment>,
)
