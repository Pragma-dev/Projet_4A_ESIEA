package com.example.projet_4a_esiea.injection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class EsieaApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // start Koin!
        startKoin {
            // Android context
            androidContext(this@EsieaApplication)
            // modules
            modules(presentationModule, domainModule, dataModule)
        }
    }
}