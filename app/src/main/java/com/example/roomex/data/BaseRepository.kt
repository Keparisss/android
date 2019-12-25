package com.example.roomex.data

abstract class BaseRepository<Params, Result> {

    abstract suspend fun doWork(params: Params): Result

}