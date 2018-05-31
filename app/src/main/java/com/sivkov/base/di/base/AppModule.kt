package com.sivkov.base.di.base

import android.content.Context
import com.sivkov.base.base.MobileApplication
import com.sivkov.base.base.logger.DebugLogger
import com.sivkov.base.di.module.ReminderListModule
import com.sivkov.base.di.scopes.PerActivity
import com.sivkov.base.tools.Logger
import com.sivkov.base.ui.MainActivity
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Module(includes = [AndroidSupportInjectionModule::class,
    AppModule.Declaration::class,
    ViewModelModule::class])
object AppModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(app: MobileApplication): Context {
        return app.applicationContext
    }

    @Module
    interface Declaration {

        @PerActivity
        @ContributesAndroidInjector(modules = [ReminderListModule::class])
        fun reminderActivityInjector(): MainActivity

        // TODO: replace with provider method
        @Singleton
        @Binds
        fun provideLogger(logger: DebugLogger): Logger

    }
}