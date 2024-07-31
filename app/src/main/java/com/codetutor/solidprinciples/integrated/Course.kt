package com.codetutor.solidprinciples.integrated

// Abstract base class
abstract class Course(
    val name: String,
    val department: Department
) {

}

interface TenureProvider{
    abstract fun getTenure(): Int?
}

// Subclasses
class UndergraduateCourse(
    name: String,
    department: Department,
    private val tenure: Int // Duration for Undergraduate
) : Course(name, department),TenureProvider {
    override fun getTenure(): Int? {
        return tenure
    }
}

class PostGraduateCourse(
    name: String,
    department: Department,
    private val tenure: Int // Duration for Post Graduate
) : Course(name, department),TenureProvider {
    override fun getTenure(): Int? {
        return tenure
    }
}

class PhdCourse(
    name: String,
    department: Department
) : Course(name, department) {

}

class PostDocCourse(
    name: String,
    department: Department
) : Course(name, department) {

}