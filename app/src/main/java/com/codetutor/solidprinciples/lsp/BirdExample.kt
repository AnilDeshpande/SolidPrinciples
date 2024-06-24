package com.codetutor.solidprinciples.lsp

open class Bird {
    open fun fly() {
        println("Bird is flying")
    }
}

class Ostrich : Bird() {}

fun makeBirdFly(bird: Bird) {
    bird.fly()
}