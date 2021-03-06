package com.gmail.me2development.fastreader.ui.di

import android.app.Application
import com.gmail.me2development.fastreader.ui.viewmodels.FullscreenTextViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module


//Application class which sets up Koin
class MainApplication :Application(){


    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin {
            androidLogger()
            androidContext(this@MainApplication)
            modules(applicationModule)
        }
    }

}

val applicationModule= module {
    viewModel { FullscreenTextViewModel() }
}