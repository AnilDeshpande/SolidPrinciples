package com.codetutor.solidprinciples.ocp

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