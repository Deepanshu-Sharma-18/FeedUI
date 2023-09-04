package com.example.feedapp.data.repository

import androidx.paging.Pager
import androidx.paging.PagingData
import com.example.feedapp.data.datasource.paging.FeedPagingSource
import com.example.feedapp.data.datasource.paging.pagingConfig
import com.example.feedapp.data.models.Feed
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FeedRepository @Inject constructor( private val feeditems : List<Feed>) {
    fun getPager(): Flow<PagingData<Feed>> {
        return Pager(config = pagingConfig,
            pagingSourceFactory = {
                FeedPagingSource(feeditems)
            }).flow
    }

    fun getIndexedPost(index : Int) : Feed{
        return feeditems[index]
    }
}
