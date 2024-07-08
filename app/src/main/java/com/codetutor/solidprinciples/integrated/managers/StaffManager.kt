package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Department
import com.codetutor.solidprinciples.integrated.Staff

class StaffManager() {
    fun assignStaffToDepartment(staff: Staff, department: Department) {
        println("Assigning ${staff.name} to department: ${department.name}")
        staff.department = department
    }
}