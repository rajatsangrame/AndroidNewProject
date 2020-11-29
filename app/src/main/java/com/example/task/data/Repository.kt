package com.example.task.data

import android.content.Context
import com.example.task.data.db.ModelDatabase

import com.example.task.data.rest.RetrofitApi

import java.util.concurrent.Executor
import java.util.concurrent.Executors

/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
class Repository(
    private var db: ModelDatabase?,
    var api: RetrofitApi,
    private val context: Context
) {

    private val ioExecutor: Executor = Executors.newSingleThreadExecutor()

    companion object {
        private const val TAG = "Repository"
    }
}