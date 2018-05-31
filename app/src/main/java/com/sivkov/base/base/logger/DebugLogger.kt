package com.sivkov.base.base.logger

import android.util.Log
import com.sivkov.base.tools.Logger
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DebugLogger
@Inject constructor() : Logger {

    override val defaultTag = generateTag(this::class)

    override fun d(tag: String, message: String) {
        Log.d(tag, "[${Thread.currentThread().name}]: $message")
    }

    override fun w(tag: String, message: String) {
        Log.d(tag, "[${Thread.currentThread().name}]: $message")
    }

    override fun e(tag: String, message: String, error: Throwable?) {
        if (error == null) {
            Log.e(tag, "[${Thread.currentThread().name}]: $message")
        } else {
            Log.e(tag, "[${Thread.currentThread().name}]: $message", error)
        }
    }
}