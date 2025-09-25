package com.example.expentrack.domain.usecase.transaction

import com.example.expentrack.domain.model.transaction.Transaction
import com.example.expentrack.domain.repository.TransactionRepository

class UpdateTransactionUseCase(private val repository: TransactionRepository) {
    suspend operator fun invoke(transaction: Transaction) {
        repository.updateTransaction(transaction)
    }
}