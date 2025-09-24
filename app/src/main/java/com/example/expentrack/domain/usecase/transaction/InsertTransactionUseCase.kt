package com.example.expentrack.domain.usecase.transaction

import com.example.expentrack.domain.model.Transaction
import com.example.expentrack.domain.repository.TransactionRepository

class InsertTransactionUseCase(private val repository: TransactionRepository) {
    suspend operator fun invoke(transaction: Transaction) {
        repository.insertTransaction(transaction)
    }
}