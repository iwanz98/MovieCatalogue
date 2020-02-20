package com.wanztudio.idcamp.moviecatalogue.utils.extension

import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

fun String.formatToViewDateDefaults(): String {
    val input = SimpleDateFormat("yyyy-MM-dd",  Locale.getDefault())
    val output = SimpleDateFormat("MMMM dd, yyyy",  Locale.getDefault())
    var inputDate : Date? = null

    try {
        inputDate = input.parse(this)
    } catch (e: ParseException) {
        e.printStackTrace()
    }

    inputDate?.let {
        return output.format(inputDate)
    } ?: return "-"
}
