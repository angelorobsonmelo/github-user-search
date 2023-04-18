package com.denisvieira05.githubusersearch.data.remote.retrofit

import okhttp3.Interceptor
import okhttp3.Response
import timber.log.Timber

class LoggedInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        Timber.d("${chain.request().method}:${chain.request().url}<--")
        val response = chain.proceed(chain.request())
        Timber.d("-->$response")
        return response
    }
}