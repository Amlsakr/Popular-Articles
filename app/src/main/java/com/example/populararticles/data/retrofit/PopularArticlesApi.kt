package com.example.populararticles.data.retrofit

import com.example.populararticles.data.model.Article
import com.example.populararticles.data.model.PopularArticlesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PopularArticlesApi{

@GET("")
fun getAllArticles(@Query("api-key")  apiKey : String): Call<PopularArticlesResponse>
}