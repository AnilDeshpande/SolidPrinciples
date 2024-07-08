package com.codetutor.solidprinciples.integrated

import com.codetutor.solidprinciples.integrated.calculators.SalaryCalculator
import com.codetutor.solidprinciples.integrated.managers.EngagementStrategy

// Abstract base class
abstract class Staff(
    val name: String,
    var department: Department,
    var salaryCalculator: SalaryCalculator
) {
    abstract fun getSalary(): Double
    abstract fun engageStudents(subject: String, students: List<Student>, strategy: EngagementStrategy)
}

// Subclasses
class AcademicStaff(
    name: String,
    department: Department,
    private val salary: Double // Fixed salary for Academic staff
    , salaryCalculator: SalaryCalculator
) : Staff(name, department, salaryCalculator) {
    override fun getSalary(): Double {
        return salaryCalculator.calculateSalary(this)
    }

    override fun engageStudents(subject: String, students: List<Student>, strategy: EngagementStrategy) {
        strategy.engageStudents(this, subject, students)
    }
}

class NonAcademicStaff(
    name: String,
    department: Department,
    private val salary: Double // Fixed salary for Non-Academic staff
    , salaryCalculator: SalaryCalculator
) : Staff(name, department, salaryCalculator) {
    override fun getSalary(): Double {
        return salaryCalculator.calculateSalary(this)
    }

    override fun engageStudents(subject: String, students: List<Student>, strategy: EngagementStrategy) {
        strategy.engageStudents(this, subject, students)
    }
}

class VisitingStaff(
    name: String,
    department: Department,
    private val payPerVisit: Double // Pay per visit for Visiting staff
    , salaryCalculator: SalaryCalculator
) : Staff(name, department, salaryCalculator) {
    override fun getSalary(): Double {
        return salaryCalculator.calculateSalary(this)
    }

    override fun engageStudents(subject: String, students: List<Student>, strategy: EngagementStrategy) {
        strategy.engageStudents(this, subject, students)
    }
}