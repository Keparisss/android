package com.example.roomex

abstract class BaseUseCase<Params, Result> {

    abstract suspend fun doWork(params: Params): Result

}
