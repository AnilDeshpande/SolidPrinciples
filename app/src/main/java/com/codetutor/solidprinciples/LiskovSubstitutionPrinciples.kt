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


interface Shape {
    fun getArea(): Int
}

interface Resizable : Shape {
    fun resize(newShape: Shape)
}

class Rectangle(private var width: Int, private var height: Int) : Shape, Resizable {
    override fun getArea(): Int {
        return width * height
    }

    override fun resize(newShape: Shape) {
        this.height = (newShape as Rectangle).height
        this.width = newShape.width
    }
}

class Square(private var side: Int) : Shape {
    override fun getArea(): Int {
        return side * side
    }

    fun resizeSquare(newSide: Int) {
        side = newSide
    }
}


interface Flyable {
    fun fly()
}

open class Bird : Flyable {
    override fun fly() {
        println("Bird is flying")
    }
}

class Ostrich

fun makeBirdFly(bird: Flyable) {
    bird.fly()
}

interface Engine {
    fun startEngine()
}

class GasEngine : Engine {
    override fun startEngine() {
        println("Starting the gas engine")
    }
}

open class Car(private var engine: Engine) {
    open fun startIgnition() {
        engine.startEngine()
    }
}

class ElectricCar(engine: Engine) : Car(engine)

fun switchOnIgnition(car: Car) {
    car.startIgnition()
}


fun main() {
    var rectangle = Rectangle(10, 20)
    var square = Square(10)

    println("Rectangle area: ${rectangle.getArea()}")
    println("Square area: ${square.getArea()}")

    //rectangle.resize(rectangle, 30, 40)
    println("New Rectangle area: ${rectangle.getArea()}")

    //square.resizeRectangle(square, 30, 40)
    println("New Square area: ${square.getArea()}")

    var sparrow = Bird()
    var ostrich = Ostrich()//Can't switch ostrich with sparrow
    makeBirdFly(sparrow)
    //makeBirdFly(ostrich)// Violates Liskov Substitution Principle

    var car = Car(GasEngine())
    //var electricCar = ElectricCar(Engine())//Can't switch electric car with normal car,
    // being forced to pass the Engine for electric car
    switchOnIgnition(car)
    //switchOnIgnition(electricCar)// Violates Liskov Substitution Principle

    val viewModels: List<BaseViewModel> = listOf(UserViewModel(), ProductViewModel())
    for (viewModel in viewModels) {
        viewModel.loadData()
    }
}
