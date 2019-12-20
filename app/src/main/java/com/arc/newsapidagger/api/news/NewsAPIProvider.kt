package com.arc.newsapidagger.api.news


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.NewsQualifier
import javax.inject.Inject

class NewsAPIProvider {

    @Inject
    @NewsQualifier
    lateinit var newsClient: BaseRetrofitClient

    fun newsServive(): NewsService {
        return newsClient.let {
            it.retrofitClient.create(NewsService::class.java)
        }
    }
}