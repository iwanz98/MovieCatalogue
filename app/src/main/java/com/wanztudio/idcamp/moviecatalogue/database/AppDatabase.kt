package com.wanztudio.idcamp.moviecatalogue.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.wanztudio.idcamp.moviecatalogue.models.Movie

@Database(
    entities = [Movie::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase(){

    abstract fun movieDao(): FavoriteMovieDao

    companion object {
        @Volatile private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            AppDatabase::class.java, "movie.db")
            .allowMainThreadQueries()
            .build()
    }
}