package com.arc.newsapidagger.api.news


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.NewsQualifier
import com.arc.newsapidagger.di.component.DaggerNetworkComponent
import javax.inject.Inject

class NewsAPIProvider {

    @Inject @field:NewsQualifier
    lateinit var newsClient: BaseRetrofitClient

    fun newsServive(): NewsService {
        DaggerNetworkComponent.create().injectNews(this)
        return newsClient.let {
            it.retrofitClient.create(NewsService::class.java)
        }
    }
}