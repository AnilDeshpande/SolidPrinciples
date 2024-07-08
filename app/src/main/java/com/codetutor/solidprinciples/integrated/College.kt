package com.codetutor.solidprinciples.integrated

import com.codetutor.solidprinciples.integrated.calculators.AcademicSalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.SalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.VisitingSalaryCalculator
import com.codetutor.solidprinciples.integrated.managers.EngagementManager
import com.codetutor.solidprinciples.integrated.managers.EngagementStrategy
import com.codetutor.solidprinciples.integrated.managers.LectureEngagement
import com.codetutor.solidprinciples.integrated.managers.StaffManager
import com.codetutor.solidprinciples.integrated.managers.StudentManager
import com.codetutor.solidprinciples.integrated.managers.WorkshopEngagement

class College(
    val departments: List<Department>,
    val staff: List<Staff>,
    val students: MutableList<Student>,
    val courses: List<Course>) {

    private var staffManager: StaffManager

    private var engagementManager: EngagementManager
    private var studentManager: StudentManager

    init {
        val calculators: Map<String, SalaryCalculator> = mapOf(
            "Academic" to AcademicSalaryCalculator(),
            "Visiting" to VisitingSalaryCalculator()
            // Add more entries as needed
        )

        val engagementStrategies: Map<String, EngagementStrategy> = mapOf(
            "Academic" to LectureEngagement(),
            "Visiting" to WorkshopEngagement()
            // Add more entries as needed
        )

        staffManager = StaffManager()

        engagementManager  = EngagementManager(engagementStrategies)
        studentManager = StudentManager(engagementManager)
    }

    fun registerStudent(student: Student) {
        studentManager.registerStudent(students, student)
    }

    fun assignStaffToDepartment(staff: Staff, department: Department) {
        staffManager.assignStaffToDepartment(staff, department)
    }

    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        studentManager.engageStudents(staff, subject, students)
    }
}
