package com.arc.newsapidagger

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class BaseRetrofitClient @Inject constructor(baseURL:String) {
    val retrofitClient = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(baseURL)
        .build()
}