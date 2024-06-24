package com.codetutor.solidprinciples

class PaymentProcessor {
    fun processPayment(paymentType: String, amount: Double) {
        when (paymentType) {
            "CreditCard" -> processCreditCardPayment(amount)
            "PayPal" -> processPayPalPayment(amount)
            else -> throw IllegalArgumentException("Unsupported payment type")
        }
    }

    private fun processCreditCardPayment(amount: Double) {
        // Logic to process credit card payment
    }

    private fun processPayPalPayment(amount: Double) {
        // Logic to process PayPal payment
    }
}



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


class HouseBuilder{
    fun buildHouse(houseType: String) {
        when (houseType) {
            "Wooden" -> buildWoodenHouse()
            "Brick" -> buildBrickHouse()
            else -> throw IllegalArgumentException("Unsupported house type")
        }
    }

    private fun buildWoodenHouse() {
        // Logic to build a wooden house
    }

    private fun buildBrickHouse() {
        // Logic to build a brick house
    }
}
