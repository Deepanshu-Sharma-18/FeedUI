package com.example.feedapp.di

import com.example.feedapp.data.models.Account
import com.example.feedapp.data.models.Comment
import com.example.feedapp.data.models.Feed
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    fun provideFeedItems(): List<Feed> {
        return listOf<Feed>(
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
}
