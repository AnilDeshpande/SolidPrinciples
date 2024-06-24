package com.codetutor.solidprinciples.isp

interface Worker {
    fun work()
    fun eat()
    fun sleep()
}

class RobotWorker : Worker {
    override fun work() {
        println("Robot working")
    }

    override fun eat() {
        throw UnsupportedOperationException("Robot does not eat")
    }

    override fun sleep() {
        throw UnsupportedOperationException("Robot does not sleep")
    }
}