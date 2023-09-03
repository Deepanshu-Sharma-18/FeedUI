package com.example.feedapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.paging.Pager
import androidx.paging.PagingData
import com.example.feedapp.models.Account
import com.example.feedapp.models.Comment
import com.example.feedapp.models.Feed
import com.example.feedapp.utils.paging.FeedPagingSource
import com.example.feedapp.utils.paging.pagingConfig
import kotlinx.coroutines.flow.Flow

class FeedViewModel : ViewModel() {


    fun getPager(): Flow<PagingData<Feed>> {
        return Pager(config = pagingConfig,
            pagingSourceFactory = { FeedPagingSource(feedposts) }).flow
    }

    val feedposts = listOf<Feed>(
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application but who are you XD", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "What is urvar?",
            likes = 10,
            comCount = 13,
            postType = "Question",
            images = listOf(),
            video = null,
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 13,
            comCount = 22,
            postType = "Marketing",
            images = listOf(
                "https://resize.indiatvnews.com/en/resize/newbucket/1200_-" + "/2019/09/chandrayaan-india-lunar-lander-1200x630-1567773381.jpg",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQMATw0FTEEL5jniGUYa" + "ZwR6upvbg_OFAQlWw&usqp=CAU",
                "https://onecms-res.cloudinary.com/image/upload/s--EEa_mztR--/f_auto,q" + "_auto/c_fill,g_auto,h_676,w_1200/v1/cna-migration/oxley-strata-landed-homes-image-1.jpg?itok=QB5O4PEm",
            ),
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),
        Feed(
            account = Account(
                name = "Neymar Jr",
                avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
            ),
            feedText = "Just landed on urvar",
            likes = 14,
            comCount = 22,
            postType = "Marketing",
            video = "https://www.nature.com/immersive/d41586-020-03435-6/video/natures-10-2020.webm",
            comments = listOf<Comment>(
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 2
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 5
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 7
                ),
                Comment(
                    Account(
                        name = "Neymar Jr",
                        avatar = "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSYWhI7TCv3XhwY1rcvjB7B_sFrAYUvLKQMgPJIaGO-qlIx2pSa"
                    ), feedText = "urvar is an application", likes = 0
                ),
            )

        ),

        )

}