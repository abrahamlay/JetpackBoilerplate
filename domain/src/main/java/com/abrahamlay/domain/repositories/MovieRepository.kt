package com.abrahamlay.domain.repositories

import com.abrahamlay.domain.entities.MovieModel

/**
 * Created by abraham.lay01 on 7/25/2019.
 */
interface MovieRepository {
    fun getPopularMovies(apiKey: String): List<MovieModel>
    fun getTopRatedMovies(apiKey: String): List<MovieModel>
}