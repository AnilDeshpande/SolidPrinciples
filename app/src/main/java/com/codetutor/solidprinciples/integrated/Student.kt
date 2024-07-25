package com.codetutor.solidprinciples.integrated

// Abstract base class
abstract class Student(
    val name: String,
    val age: Int,
    val dateOfBirth: String,
    val department: Department,
    val currentSemester: Int,
    val address: Address
)

interface CourseTypeProvider {
    fun getCourseType(): String
}


// Subclasses
class UndergraduateStudent(
    name: String,
    age: Int,
    dateOfBirth: String,
    department: Department,
    currentSemester: Int,
    address: Address
) : Student(name, age, dateOfBirth, department, currentSemester, address), CourseTypeProvider {
    override fun getCourseType(): String {
        return "Undergraduate"
    }
}

class PostGraduateStudent(
    name: String,
    age: Int,
    dateOfBirth: String,
    department: Department,
    currentSemester: Int,
    address: Address
) : Student(name, age, dateOfBirth, department, currentSemester, address), CourseTypeProvider {
    override fun getCourseType(): String {
        return "Post Graduate"
    }
}

class PhdStudent(
    name: String,
    age: Int,
    dateOfBirth: String,
    department: Department,
    currentSemester: Int,
    address: Address
) : Student(name, age, dateOfBirth, department, currentSemester, address), CourseTypeProvider {
    override fun getCourseType(): String {
        return "P.Hd"
    }
}

class PostDocStudent(
    name: String,
    age: Int,
    dateOfBirth: String,
    department: Department,
    currentSemester: Int,
    address: Address
) : Student(name, age, dateOfBirth, department, currentSemester, address) {
}