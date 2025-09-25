package com.example.expentrack.domain.model.transaction

import java.util.Date
import java.util.UUID

data class Transaction(
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String? = null,
    val amount: Double,
    val category: Category,
    val date: Date,
    val transactionType: TransactionType,
    val paymentProvider: PaymentProvider
)