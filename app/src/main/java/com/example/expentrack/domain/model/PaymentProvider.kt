package com.example.expentrack.domain.model

data class PaymentProvider(
    val type: PaymentMethodType? = null,
    val name: String? = null
)