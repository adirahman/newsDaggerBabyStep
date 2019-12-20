package com.arc.newsapidagger.di.component

import com.arc.newsapidagger.di.module.MainModule
import com.arc.newsapidagger.main.MainActivity
import com.arc.newsapidagger.main.MainPresenter
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class])
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}