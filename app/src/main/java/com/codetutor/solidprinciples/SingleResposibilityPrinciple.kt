package com.codetutor.solidprinciples

interface EmailService {
    fun sendMail(message: String)
}

class BasicEmailService : EmailService {
    override fun sendMail(message: String) {
        //logic to send basic email
    }
}

class AdvancedEmailService : EmailService {
    override fun sendMail(message: String) {
        //logic to send advanced email
    }
}

class NotificationService(private val emailService: EmailService) {
    fun notifyUser(message: String) {
        emailService.sendMail(message)
    }
}

interface LoggerService {
    fun log(message: String)
}

class Logger : LoggerService {
    override fun log(message: String) {
        println("Log: $message")
    }
}

class UserService(private val logger: LoggerService) {
    fun createUser(name: String) {
        logger.log("Creating user: $name")
    }
}

interface DatabaseService {
    fun save(data: String)
}

class SqlDatabaseService : DatabaseService {
    override fun save(data: String) {
        // Save to database
    }
}

class ServiceProvider(private val databaseService: DatabaseService) {
    fun addUser(name: String) {
        databaseService.save(name)
    }
}

