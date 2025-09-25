package com.example.expentrack.data.mapper

import com.example.expentrack.data.local.entity.TransactionEntity
import com.example.expentrack.domain.model.transaction.PaymentMethodType
import com.example.expentrack.domain.model.transaction.PaymentProvider
import com.example.expentrack.domain.model.transaction.Transaction

fun TransactionEntity.toDomain(): Transaction {
    return Transaction(
        id = id,
        title = title,
        description = description,
        amount = amount,
        category = category,
        date = date,
        transactionType = transactionType,
        paymentProvider = PaymentProvider(
            type = paymentMethodType, name = paymentProviderName
        )
    )
}

fun Transaction.toEntity(): TransactionEntity {
    return TransactionEntity(
        id = id,
        title = title,
        description = description,
        amount = amount,
        category = category,
        date = date,
        transactionType = transactionType,
        paymentMethodType = paymentProvider.type ?: PaymentMethodType.CASH,
        paymentProviderName = paymentProvider.name,
    )
}