package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.Student

interface IStudentManager {
    fun registerStudent(students: MutableList<Student>, student: Student)
    fun engageStudents(staff: Staff, subject: String, students: List<Student>)
}

class StudentManager(private val engagementManager: IEngagementManager): IStudentManager  {
    override fun registerStudent(students: MutableList<Student>, student: Student) {
        println("Registering student: ${student.name}")
        students.add(student)
    }

    override fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        engagementManager.engageStudents(staff, subject, students)
    }
}