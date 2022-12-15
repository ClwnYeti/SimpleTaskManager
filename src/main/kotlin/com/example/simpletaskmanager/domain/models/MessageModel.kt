package com.example.simpletaskmanager.domain.models

data class MessageModel(
    val sender: UserModel,
    val value: String
)