package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

class WorkshopEngagement : EngagementStrategy {
    override fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        println("${staff.name} is conducting a workshop on $subject")
    }
}