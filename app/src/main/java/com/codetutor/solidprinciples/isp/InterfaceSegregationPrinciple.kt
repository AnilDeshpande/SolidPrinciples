package com.codetutor.solidprinciples.isp

import androidx.lifecycle.ViewModel

interface Teacher {
    fun teach()
}
class MathTeacher : Teacher {
    override fun teach() {
        println("Teaching math")
    }
}
class ScienceTeacher : Teacher {
    override fun teach() {
        println("Teaching science")
    }
}
class SchoolClass(private val teachers: List<Teacher>) {
    fun startClass() {
        teachers.forEach { it.teach() }
    }
}
class TeachingSchedule(private val teacher: Teacher) {
    fun scheduleSession() {
        println("Scheduling a teaching session")
        teacher.teach()
    }
}
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

interface UserOperations {
    fun fetchUserProfile()
    fun authenticateUser()
    fun logoutUser()
}

class UserProfileViewModel : ViewModel(), UserOperations {
    override fun fetchUserProfile() {
        // Logic to fetch user profile
    }
    override fun authenticateUser() {
        throw UnsupportedOperationException("UserProfileViewModel does not handle authentication")
    }
    override fun logoutUser() {
        throw UnsupportedOperationException("UserProfileViewModel does not handle logout")
    }
}

class AuthenticationViewModel : ViewModel(), UserOperations {
    override fun fetchUserProfile() {
        throw UnsupportedOperationException("AuthenticationViewModel does not fetch user profile")
    }
    override fun authenticateUser() {
        // Logic to authenticate user
    }
    override fun logoutUser() {
        // Logic to logout user
    }
}






