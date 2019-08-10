package com.abrahamlay.data.repositoryimpl

import com.abrahamlay.data.apis.MovieAPI
import com.abrahamlay.domain.entities.MovieModel
import com.abrahamlay.domain.repositories.MovieRepository

/**
 * Created by abraham.lay01 on 7/25/2019.
 */

class MovieRepositoryImpl constructor(val api: MovieAPI) : MovieRepository {

    override fun getPopularMovies(apiKey: String): List<MovieModel> =
        api.getPopularMovies(apiKey).results.map { movie ->
            MovieModel(
                movie.voteCount,
                movie.id,
                movie.video,
                movie.voteAverage,
                movie.originalTitle,
                movie.popularity,
                movie.posterPath,
                movie.originalLanguage,
                movie.originalTitle,
//                    movie.genreIds,
                movie.backdropPath,
                movie.adult,
                movie.overview,
                movie.releaseDate

            )
        }


    override fun getTopRatedMovies(apiKey: String): List<MovieModel> =
        api.getTopRatedMovies(apiKey).results.map { movie ->
            MovieModel(
                movie.voteCount,
                movie.id,
                movie.video,
                movie.voteAverage,
                movie.originalTitle,
                movie.popularity,
                movie.posterPath,
                movie.originalLanguage,
                movie.originalTitle,
//                    movie.genreIds,
                movie.backdropPath,
                movie.adult,
                movie.overview,
                movie.releaseDate

            )
        }
}
