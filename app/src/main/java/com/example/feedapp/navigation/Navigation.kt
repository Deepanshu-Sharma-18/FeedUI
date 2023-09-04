package com.example.feedapp.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.feedapp.presentation.screens.commentScreen.CommentScreen
import com.example.feedapp.presentation.screens.feedScreen.FeedScreen
import com.example.feedapp.presentation.screens.feedScreen.FeedViewModel

@Composable
fun NavigationHandler() {
    val navController = rememberNavController()

    val feedViewModel : FeedViewModel = hiltViewModel()

    NavHost(navController = navController, startDestination = Screens.FeedScreen.name) {
        composable(Screens.FeedScreen.name) {
            FeedScreen(navController, feedViewModel)

        }
        composable(
            Screens.CommentScreen.name + "/{index}", arguments = listOf<NamedNavArgument>(
            navArgument("index") {
                type = NavType.IntType
                defaultValue = 1
            }
        )) {
            val index = it.arguments!!.getInt("index")
            CommentScreen(navController, index, feedViewModel)
        }
    }

}