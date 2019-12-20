package com.arc.newsapidagger.di.component

import com.arc.newsapidagger.api.footbal.FootballAPIProvider
import com.arc.newsapidagger.di.module.NetworkModule
import com.arc.newsapidagger.api.news.NewsAPIProvider
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent {
    fun injectNews(provider: NewsAPIProvider)
    fun injectFootball(provider: FootballAPIProvider)
}