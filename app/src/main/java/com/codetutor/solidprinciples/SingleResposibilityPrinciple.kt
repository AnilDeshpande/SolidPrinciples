package com.codetutor.solidprinciples

class EmailService {
    fun sendMail(message: String){
        //logic to send email
    }
}

class AdvancedEmailService {
    fun sendMail(message: String){
        //logic to send email
    }
}

class NotificationService{
    private var emailService: EmailService = EmailService()
    fun notifyUser(message: String){
        emailService.sendMail(message)
    }
}

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

class DatabaseService {
    fun save(data: String) {
        // Save to database
    }
}

class ServiceProvider {
    private val databaseService = DatabaseService()

    fun addUser(name: String) {
        databaseService.save(name)
    }
}

