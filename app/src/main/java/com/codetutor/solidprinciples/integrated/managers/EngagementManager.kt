package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

class EngagementManager(private val strategies: Map<String, EngagementStrategy>) {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        strategies[staff.type]?.engageStudents(staff, subject, students)
            ?: throw IllegalArgumentException("No engagement strategy found for type: ${staff.type}")
    }
}
