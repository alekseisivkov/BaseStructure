package com.sivkov.base.di.module

import android.app.Activity
import com.sivkov.base.di.scopes.PerActivity
import com.sivkov.base.ui.MainActivity
import dagger.Binds
import dagger.Module


@Module
interface ReminderListModule {

    @PerActivity
    @Binds
    fun provideActivity(activity: MainActivity): Activity

}