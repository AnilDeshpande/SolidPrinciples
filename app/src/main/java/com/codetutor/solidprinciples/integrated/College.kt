package com.codetutor.solidprinciples.integrated

import com.codetutor.solidprinciples.integrated.calculators.AcademicSalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.SalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.VisitingSalaryCalculator
import com.codetutor.solidprinciples.integrated.managers.EngagementManager
import com.codetutor.solidprinciples.integrated.managers.SalaryManager
import com.codetutor.solidprinciples.integrated.managers.StaffManager
import com.codetutor.solidprinciples.integrated.managers.StudentManager

class College(
    val departments: List<Department>,
    val staff: List<Staff>,
    val students: MutableList<Student>,
    val courses: List<Course>) {

    val calculators: Map<String, SalaryCalculator> = mapOf(
        "Academic" to AcademicSalaryCalculator(),
        "Visiting" to VisitingSalaryCalculator()
        // Add more entries as needed
    )

    private val salaryManager = SalaryManager(calculators)
    private val staffManager = StaffManager(salaryManager)
    private val studentManager = StudentManager(EngagementManager())

    fun registerStudent(student: Student) {
        studentManager.registerStudent(students, student)
    }

    fun assignStaffToDepartment(staff: Staff, department: Department) {
        staffManager.assignStaffToDepartment(staff, department)
    }

    fun calculateStaffSalary(staff: Staff): Double {
        return staffManager.calculateStaffSalary(staff)
    }

    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        studentManager.engageStudents(staff, subject, students)
    }
}
