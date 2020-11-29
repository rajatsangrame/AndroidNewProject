package com.example.task.ui.main

import android.util.Log
import androidx.lifecycle.*
import com.example.task.data.Repository
import javax.inject.Inject

/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */

class MainViewModel @Inject constructor(var repository: Repository?) : ViewModel() {

    init {
        Log.d(TAG, ": init called")
    }

    companion object {
        private const val TAG = "MainViewModel"
    }
}