package com.codetutor.solidprinciples.integrated

class EngagementManager {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        println("${staff.name} is engaging students in $subject")
    }
}
