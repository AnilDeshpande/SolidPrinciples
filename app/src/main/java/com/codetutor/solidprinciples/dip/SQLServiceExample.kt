package com.codetutor.solidprinciples.dip


class SqlDatabase {
    fun saveData(data: String) {
        println("Saving data to SQL Database: $data")
    }
}

class DataService {
    private val database = SqlDatabase()

    fun processData(data: String) {
        // Processing data
        database.saveData(data)
    }
}