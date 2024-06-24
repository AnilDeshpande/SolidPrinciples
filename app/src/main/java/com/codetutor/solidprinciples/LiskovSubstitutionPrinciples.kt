package com.codetutor.solidprinciples

import androidx.lifecycle.ViewModel

open class BaseViewModel : ViewModel() {
    open fun loadData() {
        // Load generic data
    }
}

class UserViewModel : BaseViewModel() {
    override fun loadData() {
        // Load user data
    }
}

class ProductViewModel : BaseViewModel() {
    override fun loadData() {
        throw UnsupportedOperationException(
            "ProductViewModel does not support loadData"
        )
    }
}




open class Rectangle(var width: Int, var height: Int) {
    open fun getArea(): Int {
        return width * height
    }
    fun resizeRectangle(rectangle: Rectangle,
                        newWidth: Int,
                        newHeight: Int) {
        rectangle.width = newWidth
        rectangle.height = newHeight
    }
}

class Square(side: Int) : Rectangle(side, side) {}


open class Bird {
    open fun fly() {
        println("Bird is flying")
    }
}

class Ostrich : Bird() {}

fun makeBirdFly(bird: Bird) {
    bird.fly()
}

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


fun main() {
    var rectangle = Rectangle(10, 20)
    var square = Square(10)

    println("Rectangle area: ${rectangle.getArea()}")
    println("Square area: ${square.getArea()}")

    rectangle.resizeRectangle(rectangle, 30, 40)
    println("New Rectangle area: ${rectangle.getArea()}")

    square.resizeRectangle(square, 30, 40)
    println("New Square area: ${square.getArea()}")

    var sparrow = Bird()
    var ostrich = Ostrich()//Can't switch ostrich with sparrow
    makeBirdFly(sparrow)
    makeBirdFly(ostrich)// Violates Liskov Substitution Principle

    var car = Car(Engine())
    var electricCar = ElectricCar(Engine())//Can't switch electric car with normal car,
    // being forced to pass the Engine for electric car
    switchOnIgnition(car)
    switchOnIgnition(electricCar)// Violates Liskov Substitution Principle

    val viewModels: List<BaseViewModel> = listOf(UserViewModel(), ProductViewModel())
    for (viewModel in viewModels) {
        viewModel.loadData()
    }
}
