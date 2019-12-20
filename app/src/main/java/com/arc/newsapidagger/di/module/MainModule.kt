package com.arc.newsapidagger.di.module

import com.arc.newsapidagger.main.MainContract
import com.arc.newsapidagger.main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    open fun provideMainPresenter(mainPresenter: MainPresenter): MainContract.Presenter = mainPresenter
}