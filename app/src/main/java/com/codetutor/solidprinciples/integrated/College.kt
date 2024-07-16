package com.codetutor.solidprinciples.integrated

import com.codetutor.solidprinciples.integrated.calculators.AcademicSalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.SalaryCalculator
import com.codetutor.solidprinciples.integrated.calculators.VisitingSalaryCalculator
import com.codetutor.solidprinciples.integrated.managers.EngagementManager
import com.codetutor.solidprinciples.integrated.managers.EngagementStrategy
import com.codetutor.solidprinciples.integrated.managers.LectureEngagement
import com.codetutor.solidprinciples.integrated.managers.StaffManager
import com.codetutor.solidprinciples.integrated.managers.StudentManager
import com.codetutor.solidprinciples.integrated.managers.WorkshopEngagement

class College(
    private val staffManager: StaffManager,
    private val studentManager: StudentManager,
    private val engagementManager: EngagementManager
) {
    private val departments: MutableList<Department> = mutableListOf()
    private val staff: MutableList<Staff> = mutableListOf()
    private val students: MutableList<Student> = mutableListOf()
    private val courses: MutableList<Course> = mutableListOf()

    fun addDepartment(department: Department) {
        departments.add(department)
    }

    fun addStudent(student: Student) {
        students.add(student)
        studentManager.registerStudent(students,student)
    }

    fun addCourse(course: Course) {
        courses.add(course)
    }

    fun assignStaffToDepartment(staffMember: Staff, department: Department) {
        staffManager.assignStaffToDepartment(staffMember, department)
    }

    fun engageStudents(staffMember: Staff, subject: String, students: List<Student>) {
        engagementManager.engageStudents(staffMember, subject, students)
    }
}

