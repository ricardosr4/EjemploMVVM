package com.example.ejemplomvvm.data.data

import com.example.ejemplomvvm.data.data.model.QuoteModel
import com.example.ejemplomvvm.data.data.model.QuoteProvider
import com.example.ejemplomvvm.data.data.network.QuoteService

class QuoteRepository {

    private val api = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{
        val  response : List<QuoteModel> = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}