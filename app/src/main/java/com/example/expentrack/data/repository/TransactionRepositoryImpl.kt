package com.example.expentrack.data.repository

import com.example.expentrack.data.local.dao.TransactionDao
import com.example.expentrack.data.mapper.toDomain
import com.example.expentrack.data.mapper.toEntity
import com.example.expentrack.domain.model.Transaction
import com.example.expentrack.domain.repository.TransactionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class TransactionRepositoryImpl(private val transactionDao: TransactionDao) :
    TransactionRepository {
    override fun getAllTransactions(): Flow<List<Transaction>> {
        return transactionDao.getAllTransactions().map { list ->
            list.map { it.toDomain() }
        }
    }

    override suspend fun getTransactionById(id: String): Transaction? {
        return transactionDao.getTransactionById(id)?.toDomain()
    }

    override suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(transaction.toEntity())
    }

    override suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(transaction.toEntity())
    }

    override suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(transaction.toEntity())
    }

    override suspend fun deleteTransactionById(id: String) {
        transactionDao.deleteTransactionById(id)
    }

    override suspend fun deleteAllTransactions() {
        transactionDao.deleteAllTransactions()
    }
}