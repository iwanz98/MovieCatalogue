package com.wanztudio.idcamp.moviecatalogue.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.wanztudio.idcamp.moviecatalogue.models.Movie

@Dao
interface FavoriteMovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addToFavorite(movies: Movie)

    @Query("DELETE FROM movie WHERE id = :id")
    fun removeFromFavorite(id: Int)

    @Query("SELECT COUNT(id) FROM movie WHERE id = :id")
    fun getMovieById(id : Int): Int

    @Query("SELECT * FROM movie WHERE movieType = :movieType")
    fun getMoviesByType(movieType: String): List<Movie>
}