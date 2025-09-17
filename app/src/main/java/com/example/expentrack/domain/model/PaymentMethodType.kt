package com.example.expentrack.domain.model

enum class PaymentMethodType(val displayName: String) {
    CASH("Cash"),
    CARD("Card"),
    UPI("UPI"),
    BANK_TRANSFER("Bank Transfer"),
    WALLET("Wallet"),
    OTHER("Other")
}
