package com.joseferreyra.ocr_kmm.domain

sealed class Resource <T> (val data: T?, val throwable: Throwable? = null) {

    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(throwable: Throwable, data: T? = null) : Resource<T>(data, throwable)
}