package com.abrahamlay.jetpackboilerplate.module

import com.abrahamlay.data.ApiProvider
import com.abrahamlay.data.apis.MovieAPI
import org.koin.dsl.module

/**
 * Created by Abraham Lay on 2019-08-10.
 */

val apiModule = module {
    single { ApiProvider() }
    single {
        get<ApiProvider>()
            .getRetrofit()
            .create(MovieAPI::class.java)
    }
}