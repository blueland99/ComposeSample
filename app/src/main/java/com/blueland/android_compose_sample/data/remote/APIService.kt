package com.blueland.android_compose_sample.data.remote

import retrofit2.http.GET

interface APIService {

    @GET("path/to/your/data")
    suspend fun getData(): String

    @GET("path/to/your/detail")
    suspend fun getDetailData(): String
}