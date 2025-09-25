package com.example.expentrack.domain.model.transaction

enum class Category(val displayName: String) {
    FOOD("Food"),
    TRANSPORT("Transport"),
    ENTERTAINMENT("Entertainment"),
    SHOPPING("Shopping"),
    HEALTH("Health"),
    SALARY("Salary"),
    INVESTMENT("Investment"),
    BILLS("Bills & Utilities"),
    OTHER("Other")
}