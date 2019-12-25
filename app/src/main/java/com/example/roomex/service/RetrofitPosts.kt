package com.example.roomex.service

import com.example.roomex.data.Post
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitPosts {

    @GET("posts")
    fun getPosts(): Deferred<Response<List<Post>>>

}