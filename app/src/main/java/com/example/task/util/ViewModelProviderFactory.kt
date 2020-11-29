package com.example.task.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task.data.Repository
import com.example.task.ui.main.MainViewModel

/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
class ViewModelProviderFactory(private val repository: Repository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}