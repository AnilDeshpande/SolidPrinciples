package com.codetutor.solidprinciples.integrated

class Staff(
    val name: String,
    val type: String, // "Academic", "Non-Academic", "Visiting"
    var department: Department,
    val salary: Double // Visiting professors are paid per visit, not a fixed salary
)