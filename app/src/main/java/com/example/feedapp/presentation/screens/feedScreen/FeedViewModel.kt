package com.example.feedapp.presentation.screens.feedScreen

import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingData
import com.example.feedapp.data.models.Account
import com.example.feedapp.data.models.Comment
import com.example.feedapp.data.models.Feed
import com.example.feedapp.data.datasource.paging.FeedPagingSource
import com.example.feedapp.data.datasource.paging.pagingConfig
import com.example.feedapp.data.repository.FeedRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(private val repository: FeedRepository) : ViewModel() {
    fun getFeedPosts(): Flow<PagingData<Feed>> {
        return repository.getPager()
    }
    fun getIndexPost(index : Int) : Feed{
        return repository.getIndexedPost(index)
    }

}