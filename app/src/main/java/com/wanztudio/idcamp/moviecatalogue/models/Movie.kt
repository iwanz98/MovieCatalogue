package com.wanztudio.idcamp.moviecatalogue.models

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Entity
@Parcelize
data class Movie(
    @PrimaryKey
    @SerializedName("id")
    val id: Int,
    @SerializedName("first_air_date")
    val firstAirDate: String?,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("title")
    val title: String?,
    @SerializedName("original_name")
    val originalName: String?,
    @SerializedName("vote_average")
    val voteAverage: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("release_date")
    val releaseDate: String?,
    var movieType : String
) : Parcelable