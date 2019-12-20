package com.arc.newsapidagger.di.module

import com.arc.newsapidagger.api.BaseRetrofitClient
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NetworkModule {

    //new URL
    @Provides @Named("News")
    open fun newsClient(): BaseRetrofitClient {
        return BaseRetrofitClient("https://newsapi.org/v2/")
    }

    // football URL
    @Provides @Named("Football")
    open fun footballClient(): BaseRetrofitClient{
        return BaseRetrofitClient("https://api-football-v1.p.rapidapi.com/v2/")
    }
}