package com.arc.newsapidagger

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NewsAPIProvider{

    fun create():NewsService{
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://newsapi.org/v2/")
            .build()

        return retrofit.create(NewsService::class.java)
    }
}