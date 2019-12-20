package com.arc.newsapidagger.main

import com.arc.newsapidagger.api.footbal.League
import com.arc.newsapidagger.api.news.Articles

class MainContract {

    interface View{

        fun updateListNews(listNews:List<Articles>?)
        fun updateListLeague(listLeague: List<League>?)
        fun failedGetData(message:String?)
    }

    interface Presenter{

        fun setTargetView(view: View)
        fun callNewsAPI()
        fun callEnglandLeague()
    }
}