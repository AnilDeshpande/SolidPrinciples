package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

interface EngagementStrategy {
    fun engageStudents(staff: Staff, subject: String, students: List<Student>)
    fun prepareMaterials(staff: Staff, subject: String)
}