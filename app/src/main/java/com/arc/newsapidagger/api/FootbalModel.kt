package com.arc.newsapidagger.api

data class FootbalModel(
    val api:Api?
)

data class Api(
    val results:Int?,
    val leagues:List<League>?
)

data class League(
    val league_id:Int?,
    val name:String?
)