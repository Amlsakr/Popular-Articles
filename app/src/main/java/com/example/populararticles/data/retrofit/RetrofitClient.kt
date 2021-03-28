package com.example.populararticles.data.retrofit

import com.example.populararticles.data.model.Article
import com.example.populararticles.data.model.PopularArticlesResponse
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    val API_KEY = "6SGlOVCdzWIWvSdgGTuBgtwAjZVPx0gu"
    val NY_TIMES_BASE_URL = "http://api.nytimes.com/svc/mostpopular/v2/viewed/7.json"


    var gson = GsonBuilder()
            .setLenient()
            .create()
    var  popularArticlesApi   = Retrofit.Builder()
        .baseUrl(NY_TIMES_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
        .create(PopularArticlesApi::class.java)


    fun getArticlesApi (): Call<PopularArticlesResponse> {
        return  popularArticlesApi.getAllArticles(API_KEY)
    }



}