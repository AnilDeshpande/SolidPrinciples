package com.codetutor.solidprinciples

class CreditCardPayment {
    fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount")
    }
}

class PayPalPayment {
    fun processPayment(amount: Double) {
        println("Processing PayPal payment of $$amount")
    }
}

class GenericPaymentProcessor {
    private val creditCardPayment = CreditCardPayment()
    private val payPalPayment = PayPalPayment()

    fun processCreditCardPayment(amount: Double) {
        creditCardPayment.processPayment(amount)
    }

    fun processPayPalPayment(amount: Double) {
        payPalPayment.processPayment(amount)
    }
}





