package com.example.populararticles.data.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    val API_KEY = "6SGlOVCdzWIWvSdgGTuBgtwAjZVPx0gu"
    val NY_TIMES_BASE_URL = "http://api.nytimes.com/svc/mostpopular/v2/viewed/7.json"


    var  popularArticlesApi   = Retrofit.Builder()
        .baseUrl(NY_TIMES_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(PopularArticlesApi::class.java)

    @JvmName("getMoviesApi1")
    fun getArticlesApi (): PopularArticlesApi?{
        return  popularArticlesApi
    }



}