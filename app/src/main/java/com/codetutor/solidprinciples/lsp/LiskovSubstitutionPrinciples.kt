package com.codetutor.solidprinciples.lsp

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
