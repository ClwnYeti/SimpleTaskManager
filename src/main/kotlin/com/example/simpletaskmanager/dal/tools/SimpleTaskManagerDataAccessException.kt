package com.example.simpletaskmanager.dal.tools

import com.example.simpletaskmanager.tools.SimpleTaskManagerException

open class SimpleTaskManagerDataAccessException : SimpleTaskManagerException {
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