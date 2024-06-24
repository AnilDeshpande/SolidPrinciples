package com.codetutor.solidprinciples.isp

interface Animal {
    fun fly()
    fun run()
    fun swim()
}

class Dog : Animal {
    override fun fly() {
        throw UnsupportedOperationException("Dog cannot fly")
    }

    override fun run() {
        println("Dog is running")
    }

    override fun swim() {
        println("Dog is swimming")
    }
}