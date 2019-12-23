package com.arc.newsapidagger.api.footbal


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.FootballQualifier
import com.arc.newsapidagger.di.component.DaggerNetworkComponent
import javax.inject.Inject

class FootballAPIProvider {

    @Inject @field:FootballQualifier
    lateinit var footballClient: BaseRetrofitClient

    fun footballService(): FootballService {
        DaggerNetworkComponent.create().injectFootball(this)
        return footballClient.let {
            it.retrofitClient.create(FootballService::class.java)
        }
    }
}