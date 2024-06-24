package com.codetutor.solidprinciples.isp

interface Printer {
    fun printDocument()
    fun scanDocument()
    fun faxDocument()
}

class BasicPrinter : Printer {
    override fun printDocument() {
        println("Printing document")
    }

    override fun scanDocument() {
        throw UnsupportedOperationException("BasicPrinter cannot scan documents")
    }

    override fun faxDocument() {
        throw UnsupportedOperationException("BasicPrinter cannot fax documents")
    }
}