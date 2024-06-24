package com.codetutor.solidprinciples

interface PaymentMethod {
    fun processPayment(amount: Double)
}

class CreditCardPaymentMethod : PaymentMethod {
    override fun processPayment(amount: Double) {
        // Logic to process credit card payment
    }
}

class PayPalPaymentMethod : PaymentMethod {
    override fun processPayment(amount: Double) {
        // Logic to process PayPal payment
    }
}

class PaymentProcessor(private val paymentMethod: PaymentMethod) {
    fun processPayment(amount: Double) {
        paymentMethod.processPayment(amount)
    }
}



interface FileReaderStrategy {
    fun readFile(filePath: String): String
}

class TextFileReader : FileReaderStrategy {
    override fun readFile(filePath: String): String {
        // Logic to read text file
        return "Text file content"
    }
}

class CsvFileReader : FileReaderStrategy {
    override fun readFile(filePath: String): String {
        // Logic to read CSV file
        return "CSV file content"
    }
}

class FileReader(private val strategies: Map<String, FileReaderStrategy>) {
    fun readFile(fileType: String, filePath: String): String {
        val strategy = strategies[fileType] ?: throw IllegalArgumentException("Unsupported file type")
        return strategy.readFile(filePath)
    }
}


interface HouseBuilderStrategy {
    fun buildHouse()
}

class WoodenHouseBuilder : HouseBuilderStrategy {
    override fun buildHouse() {
        // Logic to build a wooden house
    }
}

class BrickHouseBuilder : HouseBuilderStrategy {
    override fun buildHouse() {
        // Logic to build a brick house
    }
}

class HouseBuilder(private val strategies: Map<String, HouseBuilderStrategy>) {
    fun buildHouse(houseType: String) {
        val strategy = strategies[houseType] ?: throw IllegalArgumentException("Unsupported house type")
        strategy.buildHouse()
    }
}
