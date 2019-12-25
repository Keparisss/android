package com.example.roomex.data

import com.example.roomex.service.RetrofitPosts
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostsRepository :
    BaseRepository<PostsRepository.Params, PostsRepository.Result>() {

    override suspend fun doWork(params: Params): Result {
        val retrofitPosts = Retrofit
            .Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .build()
            .create(RetrofitPosts::class.java)
        val result = retrofitPosts
            .getPosts()
            .await()

        return Result(result.body())
    }

    class Params
    data class Result(val posts: List<Post>?)
}