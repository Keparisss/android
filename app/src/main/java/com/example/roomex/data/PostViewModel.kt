package com.example.roomex.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.roomex.GetListOfPostsUseCase

class PostViewModel : BaseViewModel() {

    val lengthOfPostsList = MutableLiveData<String>()

    fun getListOfPosts() {
        doWork {
            val result = GetListOfPostsUseCase()
                .doWork(GetListOfPostsUseCase.Params())
            Log.d("coroutines example", "get list of posts = ${result.posts}")
            lengthOfPostsList.postValue(result.posts?.size.toString())
        }
    }
}