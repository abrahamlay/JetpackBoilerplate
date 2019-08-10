package com.abrahamlay.domain.interactors

import com.abrahamlay.domain.BaseUseCase
import com.abrahamlay.domain.entities.MovieModel
import com.abrahamlay.domain.repositories.MovieRepository
import javax.inject.Inject


/**
 * Created by abraham.lay01 on 7/25/2019.
 */

class GetPopularMovies @Inject constructor(
    private val repository: MovieRepository
) : BaseUseCase<List<MovieModel>, GetPopularMovies.Params>() {
    override suspend fun build(params: Params): List<MovieModel> = repository.getPopularMovies(params.apiKey)

    data class Params(val apiKey: String)
}