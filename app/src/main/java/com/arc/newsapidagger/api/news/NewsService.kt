package com.arc.newsapidagger.api.news

import com.arc.newsapidagger.api.news.NewsModel
import retrofit2.Call
import retrofit2.http.GET

interface NewsService {

    @GET("top-headlines?country=id&apiKey=30c368a6b76a4a35b73010fdef953210")
    fun getHeadLines(): Call<NewsModel>
}