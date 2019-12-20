package com.arc.newsapidagger

class MainContract {

    interface View{

        fun updateListNews(listNews:List<Articles>?)
        fun failedGetData(message:String?)
    }

    interface Presenter{

        fun setTargetView(view:View)
        fun callNewsAPI()
    }
}