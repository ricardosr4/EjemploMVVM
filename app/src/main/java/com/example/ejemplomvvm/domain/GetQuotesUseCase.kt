package com.example.ejemplomvvm.domain

import com.example.ejemplomvvm.data.data.QuoteRepository
import com.example.ejemplomvvm.data.data.model.QuoteModel

class GetQuotesUseCase {
    private val  repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()


}