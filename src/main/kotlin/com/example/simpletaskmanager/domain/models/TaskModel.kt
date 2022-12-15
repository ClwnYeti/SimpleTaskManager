package com.example.simpletaskmanager.domain.models

import com.example.simpletaskmanager.domain.enums.TaskStatus
import java.util.*

data class TaskModel(
    val id: UUID,
    val name: String,
    val description: String,
    val owner: UserModel,
    val status: TaskStatus
)