package com.example.expentrack.domain.usecase.transaction

import com.example.expentrack.domain.model.Transaction
import com.example.expentrack.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow

class GetAllTransactionUseCase(private val repository: TransactionRepository) {
    operator fun invoke(): Flow<List<Transaction>> {
        return repository.getAllTransactions()
    }
}