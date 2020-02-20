package com.wanztudio.idcamp.moviecatalogue.network

interface APICallback<in T> {
    fun onSuccess(response : T?)
    fun onError(message: String)
}