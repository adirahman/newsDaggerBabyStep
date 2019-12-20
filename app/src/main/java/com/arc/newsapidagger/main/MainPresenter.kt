package com.arc.newsapidagger.main

import com.arc.newsapidagger.api.FootbalModel
import com.arc.newsapidagger.api.FootballAPIProvider
import com.arc.newsapidagger.api.news.NewsAPIProvider
import com.arc.newsapidagger.api.news.NewsModel
import dagger.Module
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@Module
class MainPresenter @Inject constructor(): MainContract.Presenter {


    lateinit var view: MainContract.View

    override fun setTargetView(view: MainContract.View) {
        this.view = view
    }

    override fun callNewsAPI() {
        val newsApi = NewsAPIProvider().newsServive()
        newsApi.getHeadLines().enqueue(object: Callback<NewsModel>{
            override fun onFailure(call: Call<NewsModel>?, t: Throwable?) {
                view.failedGetData(t?.message)
            }

            override fun onResponse(call: Call<NewsModel>?, response: Response<NewsModel>?) {
                view.updateListNews(response?.body()?.articles)
            }

        })
    }

    override fun callEnglandLeague() {
        val footballApi = FootballAPIProvider().footballService()
        footballApi.getEnglandLeague().enqueue(object : Callback<FootbalModel>{
            override fun onFailure(call: Call<FootbalModel>?, t: Throwable?) {
                view.failedGetData(t?.message)
            }

            override fun onResponse(call: Call<FootbalModel>?, response: Response<FootbalModel>?) {
                if(response?.body() != null){
                    view.updateListLeague(response?.body()?.api?.leagues)
                }else{
                    view.failedGetData("response kosong")
                }
            }

        })
    }
}