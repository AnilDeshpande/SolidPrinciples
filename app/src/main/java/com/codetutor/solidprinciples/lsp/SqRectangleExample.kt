package com.codetutor.solidprinciples.lsp

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