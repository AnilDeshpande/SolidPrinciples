package com.codetutor.solidprinciples.srp

class Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}

class UserService {
    private val logger = Logger()

    fun createUser(name: String) {
        logger.log("Creating user: $name")
    }
}