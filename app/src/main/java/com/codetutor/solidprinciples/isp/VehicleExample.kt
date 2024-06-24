package com.codetutor.solidprinciples.isp

interface Vehicle {
    fun drive()
    fun fly()
    fun sail()
}

class Taxi : Vehicle {
    override fun drive() {
        println("Taxi is driving")
    }
    override fun fly() {
        throw UnsupportedOperationException("Taxi cannot fly")
    }
    override fun sail() {
        throw UnsupportedOperationException("Taxi cannot sail")
    }
}

class Airplane : Vehicle {
    override fun drive() {
        println("Airplane is taxiing")
    }
    override fun fly() {
        println("Airplane is flying")
    }
    override fun sail() {
        throw UnsupportedOperationException("Airplane cannot sail")
    }
}

class Boat : Vehicle {
    override fun drive() {
        throw UnsupportedOperationException("Boat cannot drive")
    }
    override fun fly() {
        throw UnsupportedOperationException("Boat cannot fly")
    }
    override fun sail() {
        println("Boat is sailing")
    }
}

class VehicleManager(private val vehicle: Vehicle) {
    fun manage() {
        vehicle.drive()
        vehicle.fly()
        vehicle.sail()
    }
}






