package com.example.simpletaskmanager.serverapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleTaskManagerApi

fun main(args: Array<String>) {
    runApplication<SimpleTaskManagerApi>(*args)
}
