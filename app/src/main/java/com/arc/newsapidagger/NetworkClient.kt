package com.arc.newsapidagger

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Named

@Module
class NetworkClient {
    //new URL
    @Provides @Named("News")
    open fun newsClient():BaseRetrofitClient{
        return BaseRetrofitClient("https://newsapi.org/v2/")
    }

    // movie db URL
}