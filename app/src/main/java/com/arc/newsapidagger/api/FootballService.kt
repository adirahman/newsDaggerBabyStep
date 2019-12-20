package com.arc.newsapidagger.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

interface FootballService {

    @Headers(
        "x-rapidapi-host:api-football-v1.p.rapidapi.com",
        "x-rapidapi-key:b1954d44b6msh245afef6ec92b5bp1c3ad1jsn8f54e1f2107d"
    )
    @GET("https://api-football-v1.p.rapidapi.com/v2/leagues/country/england/2018")
    fun getEnglandLeague(): Call<FootbalModel>
}