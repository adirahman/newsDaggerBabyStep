package com.arc.newsapidagger

import dagger.Component

@Component(modules = [NetworkClient::class])
interface NetworkModule {
    fun inject(provider:NewsAPIProvider)
}