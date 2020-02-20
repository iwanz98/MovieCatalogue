package com.wanztudio.idcamp.moviecatalogue.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wanztudio.idcamp.moviecatalogue.models.Movie
import com.wanztudio.idcamp.moviecatalogue.networks.APICallback
import com.wanztudio.idcamp.moviecatalogue.networks.APIServices

class MovieViewModel : ViewModel() {

    private val TAG = MovieViewModel::class.java.simpleName

    private val listMovies: MutableLiveData<List<Movie>> = MutableLiveData()

    fun requestMovies(movieType: String, language: String) {

        APIServices.getMoviesApiCall(movieType, language, object : APICallback<List<Movie>> {
            override fun onSuccess(response : List<Movie>?) {
                listMovies.postValue(response)
            }
            override fun onError(message: String) {
                Log.e(TAG, message)
            }
        })
    }

    fun getListMovies(): LiveData<List<Movie>> = listMovies
}