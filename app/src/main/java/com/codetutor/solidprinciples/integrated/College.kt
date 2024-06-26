package com.codetutor.solidprinciples.integrated

class College(
    val departments: List<Department>,
    val staff: List<Staff>,
    val students: MutableList<Student>,
    val courses: List<Course>) {
    fun registerStudent(student: Student) {
        println("Registering student: ${student.name}")
        students.add(student)
    }

    fun assignStaffToDepartment(staff: Staff, department: Department) {
        println("Assigning ${staff.name} to department: ${department.name}")
        staff.department = department
    }
}