package com.example.geedygame.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.geedygame.repository.NewsRepository

class NewsViewModelProviderFactory(
    private val newsRepository : NewsRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
return NewsViewModel(newsRepository) as T
    }
}