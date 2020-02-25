package com.wanztudio.idcamp.moviecatalogue.network

object APIEndpoints {

    private const val BASE_URL="https://api.themoviedb.org/3"

    const val THUMBNAIL_URL="https://image.tmdb.org/t/p/w185"

    const val ENDPOINT_DISCOVER = "${BASE_URL}/discover/{type}"
    const val ENDPOINT_CREDITS = "${BASE_URL}/movie/{movieId}/credits"
}