package com.arc.newsapidagger.api.footbal


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.component.DaggerNetworkComponent
import javax.inject.Inject
import javax.inject.Named

class FootballAPIProvider {

    @Inject @field:Named("Football") lateinit var footballClient: BaseRetrofitClient

    fun footballService(): FootballService {
        DaggerNetworkComponent.create().injectFootball(this)
        return footballClient.let {
            it.retrofitClient.create(FootballService::class.java)
        }
    }
}