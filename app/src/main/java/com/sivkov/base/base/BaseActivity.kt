package com.sivkov.base.base

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject

abstract class BaseActivity<VM : ViewModel> : AppCompatActivity() {

    protected abstract val vmClass: Class<VM>

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    protected val viewModel: VM by lazy {
        ViewModelProviders.of(this, factory).get(this.vmClass)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
    }
}