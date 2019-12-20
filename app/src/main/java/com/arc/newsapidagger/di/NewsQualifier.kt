package com.arc.newsapidagger.di

import com.arc.newsapidagger.di.module.NetworkModule
import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class NewsQualifier(val value: String = NetworkModule.NEWS)