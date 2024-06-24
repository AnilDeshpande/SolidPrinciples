package com.codetutor.solidprinciples.srp

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