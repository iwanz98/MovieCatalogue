package com.wanztudio.idcamp.moviecatalogue

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.interceptors.HttpLoggingInterceptor

class BaseApplication : Application() {

    companion object {
        private val TAG = BaseApplication::class.java.simpleName

        var instance: BaseApplication? = null
            private set

        // prevent using vector drawable from crashes in pre-lollipop
        init {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        AndroidNetworking.initialize(this)
        AndroidNetworking.enableLogging(HttpLoggingInterceptor.Level.BODY)
    }
}