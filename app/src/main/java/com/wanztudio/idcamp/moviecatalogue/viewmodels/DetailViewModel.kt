package com.wanztudio.idcamp.moviecatalogue.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.wanztudio.idcamp.moviecatalogue.models.CreditResponse
import com.wanztudio.idcamp.moviecatalogue.networks.APICallback
import com.wanztudio.idcamp.moviecatalogue.networks.APIServices

class DetailViewModel : ViewModel() {

    private val TAG = DetailViewModel::class.java.simpleName

    private val creditResponse : MutableLiveData<CreditResponse> = MutableLiveData()

    fun requestMovies(movieId: String, language: String) {

        APIServices.getCreditsApiCall(movieId, language, object : APICallback<CreditResponse> {
            override fun onSuccess(response : CreditResponse?) {
                creditResponse.postValue(response)
            }
            override fun onError(message: String) {
                Log.e(TAG, message)
            }
        })
    }

    fun getCreditResponse(): LiveData<CreditResponse> = creditResponse
}