package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

interface EngagementStrategy {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>)
}

class LectureEngagement : EngagementStrategy {
    override fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        println("${staff.name} is lecturing on $subject")
    }
}

class WorkshopEngagement : EngagementStrategy {
    override fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        println("${staff.name} is conducting a workshop on $subject")
    }
}

class EngagementManager(private val strategies: Map<String, EngagementStrategy>) {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        strategies[staff.type]?.engageStudents(staff, subject, students)
            ?: throw IllegalArgumentException("No engagement strategy found for type: ${staff.type}")
    }
}
/*class EngagementManager {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        println("${staff.name} is engaging students in $subject")
    }
}*/
