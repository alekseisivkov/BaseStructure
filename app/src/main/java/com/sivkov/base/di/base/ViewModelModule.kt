package com.sivkov.base.di.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.sivkov.base.base.BaseViewModelFactory
import com.sivkov.base.ui.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton


@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindListViewModel(vm: MainViewModel): ViewModel

    @Binds
    @Singleton
    fun bindFactory(factory: BaseViewModelFactory): ViewModelProvider.Factory
}