package com.codetutor.solidprinciples.integrated

class StaffManager(private val salaryManager: SalaryManager) {
    fun assignStaffToDepartment(staff: Staff, department: Department) {
        println("Assigning ${staff.name} to department: ${department.name}")
        staff.department = department
    }

    fun calculateStaffSalary(staff: Staff): Double {
        return salaryManager.calculateSalary(staff)
    }
}