package com.example.simpletaskmanager.domain.models

import com.example.simpletaskmanager.domain.enums.SolutionStatus
import java.util.UUID

data class SolutionModel(
    val id: UUID,
    val creator: UserModel,
    val connectedTask: TaskModel,
    val status: SolutionStatus
)