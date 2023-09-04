package com.example.feedapp.data.datasource.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.feedapp.data.models.Feed


class FeedPagingSource(private val initialData: List<Feed>) : PagingSource<Int, Feed>() {
    private var refreshKey = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Feed> {
        try {
            val nextPageNumber = params.key ?: 0
            val data =
                initialData.slice(nextPageNumber * params.loadSize until (nextPageNumber + 1) * params.loadSize)
            return LoadResult.Page(
                data = data,
                prevKey = if (nextPageNumber == 0) null else nextPageNumber - 1,
                nextKey = if ((nextPageNumber + 1) * params.loadSize >= initialData.size) null else nextPageNumber + 1
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Feed>): Int? {

        return refreshKey++
    }
}


