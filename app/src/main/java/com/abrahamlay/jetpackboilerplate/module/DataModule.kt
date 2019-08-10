package com.abrahamlay.jetpackboilerplate.module

import com.abrahamlay.data.repositoryimpl.MovieRepositoryImpl
import com.abrahamlay.domain.repositories.MovieRepository
import org.koin.dsl.module

/**
 * Created by Abraham Lay on 2019-08-10.
 */

val dataModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
}