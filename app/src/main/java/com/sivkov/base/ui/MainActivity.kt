package com.sivkov.base.ui

import android.os.Bundle
import com.sivkov.base.R
import com.sivkov.base.base.BaseActivity
import com.sivkov.base.tools.Logger
import javax.inject.Inject

class MainActivity : BaseActivity<MainViewModel>() {

    override val vmClass = MainViewModel::class.java

    @Inject
    lateinit var logger: Logger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.d(message = "onCreate")
    }
}
