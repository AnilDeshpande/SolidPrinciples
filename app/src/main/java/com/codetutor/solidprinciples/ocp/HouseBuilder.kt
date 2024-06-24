package com.codetutor.solidprinciples.ocp

class HouseBuilder{
    fun buildHouse(houseType: String) {
        when (houseType) {
            "Wooden" -> buildWoodenHouse()
            "Brick" -> buildBrickHouse()
            else -> throw IllegalArgumentException("Unsupported house type")
        }
    }

    private fun buildWoodenHouse() {
        // Logic to build a wooden house
    }

    private fun buildBrickHouse() {
        // Logic to build a brick house
    }
}
