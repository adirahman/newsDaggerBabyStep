package com.arc.newsapidagger

import dagger.Component


@Component(modules = [MainPresenter::class])
interface MainModule {
    fun inject(mainActivity: MainActivity)
}