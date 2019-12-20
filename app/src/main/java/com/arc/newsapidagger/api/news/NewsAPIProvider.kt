package com.arc.newsapidagger.api.news


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.component.DaggerNetworkComponent
import javax.inject.Inject
import javax.inject.Named

class NewsAPIProvider{

    @Inject @field:Named("News") lateinit var newsClient: BaseRetrofitClient

    fun newsServive(): NewsService {
        DaggerNetworkComponent.create().injectNews(this)
        return newsClient.let {
            it.retrofitClient.create(NewsService::class.java)
        }
    }
}