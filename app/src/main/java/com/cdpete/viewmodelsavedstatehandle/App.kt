package com.cdpete.viewmodelsavedstatehandle

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import com.cdpete.viewmodelsavedstatehandle.di.myModules

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(myModules.injectModules)
        }
    }
}