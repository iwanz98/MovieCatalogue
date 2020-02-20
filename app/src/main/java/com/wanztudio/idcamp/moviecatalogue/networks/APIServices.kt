package com.wanztudio.idcamp.moviecatalogue.networks

import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.ParsedRequestListener
import com.wanztudio.idcamp.moviecatalogue.BaseApplication
import com.wanztudio.idcamp.moviecatalogue.BuildConfig
import com.wanztudio.idcamp.moviecatalogue.R
import com.wanztudio.idcamp.moviecatalogue.models.CreditResponse
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.models.MovieResponse

object APIServices {

    fun getMoviesApiCall(movieType : String, language : String, callback: APICallback<List<Movie>>){
        AndroidNetworking.get(APIEndpoints.ENDPOINT_DISCOVER)
            .addPathParameter("type", movieType)
            .addQueryParameter("api_key", BuildConfig.API_KEY)
            .addQueryParameter("language", language)
            .build()
            .getAsObject(MovieResponse::class.java, object : ParsedRequestListener<MovieResponse>{
                override fun onResponse(response: MovieResponse?) {
                    Log.i("RESPONSE", response.toString())
                    callback.onSuccess(response?.movies)
                }

                override fun onError(anError: ANError?) {
                    val errorMessage = BaseApplication.instance?.getString(R.string.alert_failed_get_data) ?: ""
                    callback.onError(errorMessage)
                }
            })
    }

    fun getCreditsApiCall(movieId : String, language : String, callback: APICallback<CreditResponse>){
        AndroidNetworking.get(APIEndpoints.ENDPOINT_CREDITS)
            .addPathParameter("movieId", movieId)
            .addQueryParameter("api_key", BuildConfig.API_KEY)
            .addQueryParameter("language", language)
            .build()
            .getAsObject(CreditResponse::class.java, object : ParsedRequestListener<CreditResponse>{
                override fun onResponse(response: CreditResponse?) {
                    Log.i("RESPONSE", response.toString())
                    callback.onSuccess(response)
                }

                override fun onError(anError: ANError?) {
                    val errorMessage = BaseApplication.instance?.getString(R.string.alert_failed_get_data) ?: ""
                    callback.onError(errorMessage)
                }
            })
    }

}