package com.example.feedapp.utils.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import com.example.feedapp.R
import com.example.feedapp.models.Feed
import com.example.feedapp.utils.navigation.Screens

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun FeedPost(
    feed: Feed,
    onClick: () -> Unit
) {

    val pageCount = feed.images.size
    val pagerState = rememberPagerState(
        initialPage = 0
    )

    Column(modifier = Modifier
        .clickable {
            onClick()
        }
        .padding(vertical = 15.dp, horizontal = 15.dp)) {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Card(
                modifier = Modifier
                    .size(60.dp)
                    .clip(shape = RoundedCornerShape(corner = CornerSize(50)))
            ) {
                AsyncImage(
                    model = feed.account.avatar,
                    contentDescription = "avatar"
                )
            }

            Spacer(modifier = Modifier.width(10.dp))
            Column {
                Text(
                    text = feed.account.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = "2 hours ago",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colorScheme.inverseSurface.copy(alpha = 0.8F)
                )
            }

            Spacer(modifier = Modifier.width(20.dp))
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(25.dp)
                    .clip(shape = RoundedCornerShape(corner = CornerSize(10.dp)))
                    .background(color = MaterialTheme.colorScheme.inversePrimary)

            ) {
                Text(
                    text = feed.postType,
                    fontSize = 15.sp,
                    modifier = Modifier.align(alignment = Alignment.Center),
                    color = MaterialTheme.colorScheme.primary
                )
            }

            Spacer(modifier = Modifier.width(30.dp))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = "options"
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = feed.feedText, fontSize = 18.sp)

        Spacer(modifier = Modifier.height(20.dp))


        if (pageCount != 0) {

            HorizontalPager(pageCount = pageCount, state = pagerState) {
                SubcomposeAsyncImage(
                    model = feed.images[it],
                    contentDescription = "",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    loading = {
                        CircularProgressIndicator(color = MaterialTheme.colorScheme.primary)
                    }
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            Row(
                Modifier
                    .height(20.dp)
                    .fillMaxWidth()
                    .align(Alignment.End),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pageCount) { iteration ->
                    val color =
                        if (pagerState.currentPage == iteration) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.inversePrimary
                    Box(
                        modifier = Modifier
                            .padding(2.dp)
                            .clip(CircleShape)
                            .background(color)
                            .size(10.dp)

                    )
                }
            }
        } else if (feed.video != null && feed.video != null) {
            VideoPlayer(uri = null, link = feed.video)
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        ) {


            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(onClick = {
                }) {
                    Icon(
                        painter = if (feed.likes % 2 == 0) painterResource(id = R.drawable.heart) else painterResource(
                            id = R.drawable.like
                        ),
                        contentDescription = "icon-likes",
                        modifier = Modifier.size(25.dp),
                        tint = if (feed.likes % 2 == 0) MaterialTheme.colorScheme.primary else Color.Black
                    )
                }

                Text(text = feed.likes.toString(), fontSize = 14.sp)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.comment),
                        contentDescription = "icon-comments",
                        modifier = Modifier.size(25.dp)
                    )
                }

                Text(text = feed.comCount.toString(), fontSize = 14.sp)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.share),
                        contentDescription = "icon-send",
                        modifier = Modifier.size(25.dp)
                    )
                }

                Text(text = "Share", fontSize = 14.sp)
            }
        }

    }
}