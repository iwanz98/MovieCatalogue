package com.wanztudio.idcamp.moviecatalogue.models

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Crew (val name : String, val role : String) : Parcelable