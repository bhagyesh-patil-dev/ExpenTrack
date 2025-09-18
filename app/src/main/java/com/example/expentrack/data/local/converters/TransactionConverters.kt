package com.example.expentrack.data.local.converters

import androidx.room.TypeConverter
import com.example.expentrack.domain.model.Category
import com.example.expentrack.domain.model.PaymentMethodType
import com.example.expentrack.domain.model.TransactionType
import java.util.Date

class TransactionConverters {

    @TypeConverter
    fun fromDate(date: Date?): Long? = date?.time

    @TypeConverter
    fun toDate(timeStamp: Long?): Date? = timeStamp?.let { Date(it) }

    @TypeConverter
    fun fromCategory(value: Category?): String? = value?.name

    @TypeConverter
    fun toCategory(value: String?): Category? = value?.let { Category.valueOf(it) }

    @TypeConverter
    fun fromTransactionType(value: TransactionType?): String? = value?.name

    @TypeConverter
    fun toTransactionType(value: String?): TransactionType? =
        value?.let { TransactionType.valueOf(it) }

    @TypeConverter
    fun fromPaymentMethodType(value: PaymentMethodType?): String? = value?.name

    @TypeConverter
    fun toPaymentMethodType(value: String?): PaymentMethodType? =
        value?.let { PaymentMethodType.valueOf(it) }
}