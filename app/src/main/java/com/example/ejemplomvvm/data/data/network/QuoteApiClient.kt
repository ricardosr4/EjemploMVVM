package com.example.ejemplomvvm.data.data.network

import com.example.ejemplomvvm.data.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>
}