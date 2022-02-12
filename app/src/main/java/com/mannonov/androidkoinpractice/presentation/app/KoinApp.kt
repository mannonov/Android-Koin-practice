package com.mannonov.androidkoinpractice.presentation.app

import android.app.Application
import com.mannonov.androidkoinpractice.presentation.di.appModule
import com.mannonov.androidkoinpractice.presentation.di.dataModule
import com.mannonov.androidkoinpractice.presentation.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class KoinApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(level = Level.DEBUG)
            androidContext(this@KoinApp)
            modules(listOf(appModule, dataModule, domainModule))
        }

    }

}