package com.example.task.di.component

import com.example.task.data.Repository
import com.example.task.di.ApplicationScope
import com.example.task.di.module.ApplicationModule
import com.example.task.util.ViewModelFactory
import dagger.Component

/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
@ApplicationScope
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun getRepository(): Repository?

    fun getViewModelFactory(): ViewModelFactory

}