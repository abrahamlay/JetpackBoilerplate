package com.abrahamlay.domain.interactors

import com.abrahamlay.domain.BaseUseCase
import com.abrahamlay.domain.entities.MovieModel
import com.abrahamlay.domain.repositories.MovieRepository
import javax.inject.Inject


/**
 * Created by abraham.lay01 on 7/25/2019.
 */

class GetTopRatedMovies @Inject constructor(
    private val repository: MovieRepository
) : BaseUseCase<List<MovieModel>, GetTopRatedMovies.Params>() {
    override suspend fun build(params: Params): List<MovieModel> = repository.getTopRatedMovies(params.apiKey)

    data class Params(val apiKey: String)
}