package com.wanztudio.idcamp.moviecatalogue.networks

interface APICallback<in T> {
    fun onSuccess(response : T?)
    fun onError(message: String)
}