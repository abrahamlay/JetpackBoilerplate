package com.abrahamlay.jetpackboilerplate

import android.app.Application
import com.abrahamlay.jetpackboilerplate.module.apiModule
import com.abrahamlay.jetpackboilerplate.module.dataModule
import com.abrahamlay.jetpackboilerplate.module.useCaseModule
import com.abrahamlay.jetpackboilerplate.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * Created by Abraham Lay on 2019-08-10.
 */
class AndroidApp :Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@AndroidApp)
            modules(
                listOf(
                    dataModule,
                    apiModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}