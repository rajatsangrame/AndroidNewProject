package com.example.task.di.module

import android.content.Context
import com.example.task.di.ApplicationContext
import com.example.task.di.ApplicationScope
import dagger.Module
import dagger.Provides


/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
@Module
class ContextModule(var context: Context) {

    @ApplicationContext
    @ApplicationScope
    @Provides
    fun context(): Context {
        return context.applicationContext
    }
}