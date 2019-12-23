package com.arc.newsapidagger.di.module

import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.FootballQualifier
import com.arc.newsapidagger.di.NewsQualifier
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    //new URL
    @Provides @NewsQualifier
    open fun newsClient(): BaseRetrofitClient {
        return BaseRetrofitClient("https://newsapi.org/v2/")
    }

    // football URL
    @Provides @FootballQualifier
    open fun footballClient(): BaseRetrofitClient{
        return BaseRetrofitClient("https://api-football-v1.p.rapidapi.com/v2/")
    }
}