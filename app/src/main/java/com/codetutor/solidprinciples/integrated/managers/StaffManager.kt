package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Department
import com.codetutor.solidprinciples.integrated.Staff

class StaffManager(private val salaryManager: SalaryManager) {
    fun assignStaffToDepartment(staff: Staff, department: Department) {
        println("Assigning ${staff.name} to department: ${department.name}")
        staff.department = department
    }

    fun calculateStaffSalary(staff: Staff): Double {
        return salaryManager.calculateSalary(staff)
    }
}