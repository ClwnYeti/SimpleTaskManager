package com.example.SimpleTaskManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleTaskManagerApplication

fun main(args: Array<String>) {
    runApplication<SimpleTaskManagerApplication>(*args)
}
