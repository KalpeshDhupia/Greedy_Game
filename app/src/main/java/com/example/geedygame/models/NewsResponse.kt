package com.example.geedygame.models

import com.example.geedygame.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)