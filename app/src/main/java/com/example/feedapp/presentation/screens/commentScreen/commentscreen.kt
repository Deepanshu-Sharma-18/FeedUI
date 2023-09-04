package com.example.feedapp.presentation.screens.commentScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.KeyboardArrowDown
import androidx.compose.material.icons.rounded.KeyboardArrowUp
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.feedapp.presentation.components.CommentPost
import com.example.feedapp.presentation.components.FeedPost
import com.example.feedapp.presentation.components.Line
import com.example.feedapp.presentation.screens.feedScreen.FeedViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommentScreen(navController: NavController, index: Int, viewModel: FeedViewModel) {


    val feedsPost = viewModel.getIndexPost(index)
    val scrollState = rememberScrollState()

    Scaffold(modifier = Modifier.fillMaxSize(), topBar = {
        SmallTopAppBar(

            title = {
                Text(text = "Comments", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            },
            navigationIcon = {
                IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(
                        imageVector = Icons.Rounded.ArrowBack,
                        contentDescription = "arrow-back"
                    )
                }
            }
        )
    }) {
        Column(
            modifier = Modifier.verticalScroll(
                scrollState
            )
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            FeedPost(feed = feedsPost) {}
            Line()
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = "Comments",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Column(verticalArrangement = Arrangement.Center) {
                        Icon(
                            imageVector = Icons.Rounded.KeyboardArrowUp,
                            contentDescription = "up",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Rounded.KeyboardArrowDown,
                            contentDescription = "down",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.size(12.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = "Recent",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            Line()

            for (comment in feedsPost.comments) {
                CommentPost(comment = comment)
                Line()
            }


        }

    }
}