package com.example.expentrack.domain.usecase.transaction

import com.example.expentrack.domain.model.Transaction
import com.example.expentrack.domain.repository.TransactionRepository

class GetTransactionByIdUseCase(private val repository: TransactionRepository) {
    suspend operator fun invoke(id: String): Transaction? {
        return repository.getTransactionById(id)
    }
}