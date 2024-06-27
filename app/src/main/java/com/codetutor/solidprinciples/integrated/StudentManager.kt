package com.codetutor.solidprinciples.integrated

class StudentManager(private val engagementManager: EngagementManager) {
    fun registerStudent(students: MutableList<Student>, student: Student) {
        println("Registering student: ${student.name}")
        students.add(student)
    }

    fun engageStudents(staff: Staff, subject: String, students: List<Student>) {
        engagementManager.engageStudents(staff, subject, students)
    }
}