package com.codetutor.solidprinciples.lsp

class Engine {
    fun startEngine() {
        println("Starting the engine")
    }
}

open class Car(var engine: Engine) {
    open fun startIgnition() {
        engine.startEngine()
    }
}

class ElectricCar(engine: Engine) : Car(engine) {}

fun switchOnIgnition(car: Car) {
    car.startIgnition()
}