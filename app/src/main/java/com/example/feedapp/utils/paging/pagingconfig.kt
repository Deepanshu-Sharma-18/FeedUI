package com.example.feedapp.utils.paging

import androidx.paging.PagingConfig

val pagingConfig = PagingConfig(
    pageSize = 5, // Number of items to load at once
    prefetchDistance = 1, // The distance from the end of the loaded list at which to trigger loading more items
    initialLoadSize = 10, // Initial number of items to load
    enablePlaceholders = false // Set to true if you want to show placeholders for unloaded items
)
