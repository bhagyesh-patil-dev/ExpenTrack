package com.example.expentrack.domain.usecase.transaction

import com.example.expentrack.domain.repository.TransactionRepository

class DeleteTransactionByIdUseCase(private val repository: TransactionRepository) {
    suspend operator fun invoke(id: String) {
        repository.deleteTransactionById(id)
    }
}