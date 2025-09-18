package com.example.expentrack.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.expentrack.domain.model.Category
import com.example.expentrack.domain.model.PaymentMethodType
import com.example.expentrack.domain.model.TransactionType
import java.util.Date
import java.util.UUID

@Entity(tableName = "transactions")
data class TransactionEntity(
    @PrimaryKey
    val id: String = UUID.randomUUID().toString(),
    val title: String,
    val description: String? = null,
    val amount: Double,
    val category: Category,
    val date: Date,
    val transactionType: TransactionType,
    val paymentMethodType: PaymentMethodType,
    val paymentProviderName: String? = null
)
