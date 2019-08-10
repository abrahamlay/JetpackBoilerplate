package com.abrahamlay.jetpackboilerplate.module

import com.abrahamlay.domain.interactors.GetPopularMovies
import com.abrahamlay.domain.interactors.GetTopRatedMovies
import org.koin.dsl.module
import org.koin.experimental.builder.factory

/**
 * Created by Abraham Lay on 2019-08-10.
 */

val useCaseModule = module {
    factory<GetPopularMovies>()
    factory<GetTopRatedMovies>()
}