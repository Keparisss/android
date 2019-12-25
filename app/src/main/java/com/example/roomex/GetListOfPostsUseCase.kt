package com.example.roomex

import com.example.roomex.data.Post
import com.example.roomex.data.PostsRepository

class GetListOfPostsUseCase
    : BaseUseCase<GetListOfPostsUseCase.Params, GetListOfPostsUseCase.Result>() {

    override suspend fun doWork(params: Params): Result {
        return Result(
            PostsRepository()
                .doWork(PostsRepository.Params())
                //.response
                .posts
        )
    }

    class Params
    class Result(val posts: List<Post>?)
}