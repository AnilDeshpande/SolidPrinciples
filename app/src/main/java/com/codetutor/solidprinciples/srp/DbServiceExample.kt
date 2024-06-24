package com.codetutor.solidprinciples.srp

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

