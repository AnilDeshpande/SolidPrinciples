package com.codetutor.solidprinciples.dip

//LLM - Concrete Class
class FileStorage {
    fun writeFile(content: String) {
        println("Writing content to file: $content")
    }
}

//HLM - Concrete class
class ReportGenerator {
    private val storage = FileStorage()

    fun generateReport(report: String) {
        // Generating report
        storage.writeFile(report)
    }
}





