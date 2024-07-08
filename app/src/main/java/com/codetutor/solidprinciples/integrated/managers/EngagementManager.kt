package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

class EngagementManager(private val strategies: Map<String, EngagementStrategy>) {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        val strategy = strategies[staff.department.name]
            ?: throw IllegalArgumentException("No engagement strategy found for department: ${staff.department.name}")
        staff.engageStudents(subject, students, strategy)
    }
}
