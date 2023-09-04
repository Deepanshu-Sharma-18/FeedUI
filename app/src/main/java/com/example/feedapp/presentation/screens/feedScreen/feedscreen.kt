package com.example.feedapp.presentation.screens.feedScreen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.paging.PagingData
import com.example.feedapp.data.models.Feed
import com.example.feedapp.presentation.screens.bazzarScreen.BazaarSceen
import com.example.feedapp.presentation.components.FeedList
import com.example.feedapp.presentation.screens.profileScreen.ProfileSceen
import kotlinx.coroutines.flow.Flow

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FeedScreen(navController: NavController, viewModel: FeedViewModel) {

    val active = remember {
        mutableStateOf(0)
    }


    val tabs = listOf<String>("charcha", "bazaar", "profile")


    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.background,
        topBar = {

            Column(verticalArrangement = Arrangement.Center) {
                TabRow(
                    selectedTabIndex = active.value,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(80.dp),
                    containerColor = MaterialTheme.colorScheme.background,
                    indicator = {


                        TabRowDefaults.Indicator(
                            modifier =
                            Modifier
                                .tabIndicatorOffset(it[active.value])
                                .padding(top = 40.dp, start = 20.dp, end = 20.dp),
                            height = 3.dp,
                            color = MaterialTheme.colorScheme.primary

                        )

                    }

                ) {
                    tabs.forEachIndexed() { index, s ->
                        Tab(
                            modifier = Modifier.height(60.dp),
                            selected = active.value == index,
                            onClick = { if (active.value != index) active.value = index }) {
                            Text(
                                text = s,
                                fontSize = 16.sp,
                                color = if (active.value == index) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.inverseSurface.copy(
                                    alpha = 0.8F
                                ),
                                fontWeight = FontWeight.SemiBold
                            )

                        }

                    }

                }
            }
        }

    ) {

        when (active.value) {
            0 -> {
                val feedData: Flow<PagingData<Feed>> = viewModel.getFeedPosts()

                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = MaterialTheme.colorScheme.background)

                    ) {
                        Spacer(modifier = Modifier.height(70.dp))
                        FeedList(feedData = feedData, navController = navController)
                    }
                }
            }

            1 -> {
                BazaarSceen()
            }

            2 -> {
                ProfileSceen()
            }
        }

    }
}