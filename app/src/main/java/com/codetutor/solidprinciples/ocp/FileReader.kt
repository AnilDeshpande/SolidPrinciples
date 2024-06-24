package com.codetutor.solidprinciples.ocp

class FileReader {
    fun readFile(fileType: String, filePath: String): String {
        return when (fileType) {
            "txt" -> readTextFile(filePath)
            "csv" -> readCsvFile(filePath)
            else -> throw IllegalArgumentException("Unsupported file type")
        }
    }

    private fun readTextFile(filePath: String): String {
        // Logic to read text file
        return "Text file content"
    }

    private fun readCsvFile(filePath: String): String {
        // Logic to read CSV file
        return "CSV file content"
    }
}