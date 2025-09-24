package com.example.expentrack.domain.usecase.transaction

data class TransactionUseCases(
    val insertTransactionUseCase: InsertTransactionUseCase,
    val getTransactionByIdUseCase: GetTransactionByIdUseCase,
    val getAllTransactionUseCase: GetAllTransactionUseCase,
    val deleteTransactionByIdUseCase: DeleteTransactionByIdUseCase,
    val deleteTransactionUseCase: DeleteTransactionUseCase,
    val updateTransactionUseCase: UpdateTransactionUseCase
)