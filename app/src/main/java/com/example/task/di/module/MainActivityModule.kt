package com.example.task.di.module

import com.example.task.ui.main.MainActivity
import dagger.Module


/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
@Module
class MainActivityModule(var mainActivity: MainActivity) {

//    @Provides
//    @MainActivityScope
//    fun getAdapter(): TrackAdapter {
//        val trackAdapter = TrackAdapter()
//        trackAdapter.setHasStableIds(true)
//        return trackAdapter
//    }

}