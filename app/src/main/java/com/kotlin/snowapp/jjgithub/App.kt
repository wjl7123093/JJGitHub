package com.kotlin.snowapp.jjgithub

import android.app.Application
import android.content.ContextWrapper

/**
 * Created by snow on 2020/10/16.
 */

private lateinit var INSTANCE: Application

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

object AppContext: ContextWrapper(INSTANCE)