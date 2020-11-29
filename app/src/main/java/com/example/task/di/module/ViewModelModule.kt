package com.example.task.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.task.di.ViewModelKey
import com.example.task.ui.main.MainViewModel
import com.example.task.util.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


/**
 * Created by Rajat Sangrame
 * http://github.com/rajatsangrame
 */
@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory?): ViewModelProvider.Factory?

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun provideHomeViewModel(homeViewModel: MainViewModel?): ViewModel?

}