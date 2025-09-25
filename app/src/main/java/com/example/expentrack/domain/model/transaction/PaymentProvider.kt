package com.example.expentrack.domain.model.transaction

data class PaymentProvider(
    val type: PaymentMethodType? = null,
    val name: String? = null
)