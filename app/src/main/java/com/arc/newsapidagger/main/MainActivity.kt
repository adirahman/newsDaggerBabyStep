package com.arc.newsapidagger.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arc.newsapidagger.*
import com.arc.newsapidagger.api.League
import com.arc.newsapidagger.api.news.Articles
import com.arc.newsapidagger.di.component.DaggerActivityComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),
    MainContract.View {

    @Inject lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerActivityComponent.create().inject(this)

        presenter.setTargetView(this)
        //presenter.callNewsAPI()
        presenter.callEnglandLeague()
    }

    override fun updateListNews(listNews: List<Articles>?) {
        for( i in 0..listNews!!.size-1 ){
            text_view.append(listNews[i].title+"\n\n")
        }
    }

    override fun updateListLeague(listLeague: List<League>?) {
        for (i in 0..listLeague!!.size-1){
            text_view.append(listLeague[i].name+"\n\n")
        }
    }


    override fun failedGetData(message: String?) {
        text_view.text = message
    }
}
