package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.data.QuoteRepository
import com.example.ejemplomvvm.data.data.model.QuoteModel
import com.example.ejemplomvvm.data.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel?{
        val quotes : List<QuoteModel> = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }

}