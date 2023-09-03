package com.example.feedapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.feedapp.models.Feed
import com.example.feedapp.utils.components.FeedPost
import com.example.feedapp.utils.components.Line
import com.example.feedapp.utils.navigation.Screens
import kotlinx.coroutines.flow.Flow

@Composable
fun FeedList(feedData: Flow<PagingData<Feed>>, navController: NavController) {
    val lazyPagingItems: LazyPagingItems<Feed> = feedData.collectAsLazyPagingItems()

    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Fixed(1),
    ) {
        items(lazyPagingItems.itemCount) { feed ->
            FeedPost(feed = lazyPagingItems[feed]!!) {
                navController.navigate(Screens.CommentScreen.name + "/${feed}")
            }
            Line()
        }

        item {

            if (lazyPagingItems.loadState.refresh == LoadState.Loading) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(550.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    CircularProgressIndicator(
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }

            if (lazyPagingItems.loadState.append == LoadState.Loading) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(550.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                ) {
                    CircularProgressIndicator(
                        color = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }

    }
}
