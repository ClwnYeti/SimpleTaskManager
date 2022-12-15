package com.example.simpletaskmanager.domain.models

data class ChatModel(
    val connectedTask: TaskModel,
    val messages: MutableCollection<MessageModel>
)
