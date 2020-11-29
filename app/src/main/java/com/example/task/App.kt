package com.example.task

import android.app.Application
import android.content.Context
import com.example.task.di.component.ApplicationComponent
import com.example.task.di.component.DaggerApplicationComponent
import com.example.task.di.module.ContextModule


/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
class App : Application() {

    private var component: ApplicationComponent? = null

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent
            .builder()
            .contextModule(ContextModule(this))
            .build()
    }

    fun getComponent(): ApplicationComponent? {
        return component
    }

    companion object {
        @JvmStatic
        fun get(context: Context): App? {
            return context.applicationContext as App
        }
    }
}