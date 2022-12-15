package com.example.simpletaskmanager.domain.models

import java.util.*

data class UserModel(
    val id: UUID,
    val info: PersonModel,
    val doneTasksCount: Int,
    val activeIssuedTasksCount: Int
)