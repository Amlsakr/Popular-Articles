package com.example.populararticles.data.repository

import androidx.lifecycle.LiveData
import com.example.populararticles.data.model.Article

interface PopularArticlesRepository {

    fun getAllArticles() : LiveData<List<Article>>
}