package com.codetutor.solidprinciples.integrated

// Abstract base class
abstract class Department(
    val name: String
)

// Subclasses
class AcademicDepartment(
    name: String
) : Department(name)

class NonAcademicDepartment(
    name: String
) : Department(name)