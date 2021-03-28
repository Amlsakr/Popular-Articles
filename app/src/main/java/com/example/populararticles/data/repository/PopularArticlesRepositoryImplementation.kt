package com.example.populararticles.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.populararticles.data.model.Article
import com.example.populararticles.data.model.PopularArticlesResponse
import com.example.populararticles.data.retrofit.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PopularArticlesRepositoryImplementation : PopularArticlesRepository {


    val TAG = "PopArtisRepositoryImp"
    private var retrofitClient: RetrofitClient? = null;
    private var allArticles: LiveData<List<Article>>? = null;

    init {
        retrofitClient = RetrofitClient
    }

    override fun getAllArticles(): LiveData<List<Article>> {
        var data = MutableLiveData<List<Article>>()

        val call = retrofitClient?.getArticlesApi()
        call?.enqueue(object : Callback<PopularArticlesResponse>{
            override fun onResponse(call: Call<PopularArticlesResponse>, response: Response<PopularArticlesResponse>) {
                data.postValue(response.body()?.results)
            }

            override fun onFailure(call: Call<PopularArticlesResponse>, t: Throwable) {

                Log.e(TAG, t.message.toString())
                t.printStackTrace()
            }

        })



        return data
    }
}