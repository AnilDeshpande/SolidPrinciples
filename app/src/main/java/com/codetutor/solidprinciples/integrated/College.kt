package com.codetutor.solidprinciples.integrated

class College(
    val departments: List<Department>,
    val staff: List<Staff>,
    val students: MutableList<Student>,
    val courses: List<Course>) {

    private val staffManager = StaffManager(SalaryManager())
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
