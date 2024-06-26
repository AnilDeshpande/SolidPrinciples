package com.codetutor.solidprinciples.integrated

class Student(
    val name: String,
    val age: Int,
    val dateOfBirth: String,
    val courseType: String, // "Undergraduate", "Post Graduate", "P.Hd", "Post Doc"
    val department: Department,
    val currentSemester: Int,
    val address: Address
)