package com.arc.newsapidagger

import javax.inject.Inject
import javax.inject.Named

class NewsAPIProvider{

    @Inject @field:Named("News") lateinit var newsClient:BaseRetrofitClient

    fun newsServive():NewsService{
        DaggerNetworkModule.create().inject(this)
        return newsClient.let {
            it.retrofitClient.create(NewsService::class.java)
        }
    }
}