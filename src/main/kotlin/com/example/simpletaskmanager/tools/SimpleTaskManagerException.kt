package com.example.simpletaskmanager.tools

open class SimpleTaskManagerException : Exception {
    constructor(message: String, cause: Throwable, enableSuppression : Boolean, writableStackTrace : Boolean) :
            super(message, cause, enableSuppression, writableStackTrace)
    constructor(message: String) :
            super(message = message)
    constructor(message: String, cause: Throwable) :
            super(message, cause)
    constructor(cause: Throwable) :
            super(cause)
    constructor() :
            super()
}