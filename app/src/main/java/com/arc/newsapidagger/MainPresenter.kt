package com.arc.newsapidagger

import dagger.Module
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@Module
class MainPresenter @Inject constructor(): MainContract.Presenter {


    lateinit var view:MainContract.View

    override fun setTargetView(view: MainContract.View) {
        this.view = view
    }

    override fun callNewsAPI() {
        val newsApi = NewsAPIProvider.create()
        newsApi.getHeadLines().enqueue(object: Callback<NewsModel>{
            override fun onFailure(call: Call<NewsModel>?, t: Throwable?) {
                view.failedGetData(t?.message)
            }

            override fun onResponse(call: Call<NewsModel>?, response: Response<NewsModel>?) {
                view.updateListNews(response?.body()?.articles)
            }

        })
    }
}