package com.arc.newsapidagger.di.component

import com.arc.newsapidagger.main.MainActivity
import com.arc.newsapidagger.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainPresenter::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}