package com.example.task.di.component

import com.example.task.di.MainActivityScope
import com.example.task.di.module.MainActivityModule
import com.example.task.ui.main.MainActivity
import dagger.Component


/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
@Component(modules = [MainActivityModule::class], dependencies = [ApplicationComponent::class])
@MainActivityScope
interface MainActivityComponent {
    fun injectMainActivity(mainActivity: MainActivity?)
}