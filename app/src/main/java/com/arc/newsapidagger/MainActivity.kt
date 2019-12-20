package com.arc.newsapidagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),  MainContract.View{

    @Inject lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerMainModule.create().inject(this)

        presenter.setTargetView(this)
        presenter.callNewsAPI()
    }

    override fun updateListNews(listNews: List<Articles>?) {
        for( i in 0..listNews!!.size-1 ){
            text_view.append(listNews[i].title+"\n\n")
        }
    }


    override fun failedGetData(message: String?) {
        text_view.text = message
    }
}
