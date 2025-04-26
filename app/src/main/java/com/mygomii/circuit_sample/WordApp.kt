package com.mygomii.circuit_sample

import android.app.Application
import com.mygomii.circuit_sample.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class WordApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@WordApp)
            modules(appModule())
        }
    }
}