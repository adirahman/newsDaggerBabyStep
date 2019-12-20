package com.arc.newsapidagger.api.footbal


import com.arc.newsapidagger.api.BaseRetrofitClient
import com.arc.newsapidagger.di.FootballQualifier
import javax.inject.Inject

class FootballAPIProvider {

    @Inject @FootballQualifier lateinit var footballClient: BaseRetrofitClient

    fun footballService(): FootballService {

        return footballClient.let {
            it.retrofitClient.create(FootballService::class.java)
        }
    }
}