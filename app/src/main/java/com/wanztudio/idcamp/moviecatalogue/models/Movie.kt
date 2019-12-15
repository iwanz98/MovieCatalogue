package com.wanztudio.idcamp.moviecatalogue.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    val id : Long,
    val title : String,
    val score : Int,
    val thumbnail : Int,
    val releaseDate : String,
    val overview :String,
    val crews: MutableList<Crew>
) : Parcelable