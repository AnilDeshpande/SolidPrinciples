package com.codetutor.solidprinciples.integrated

class SalaryManager {
    fun calculateSalary(staff: Staff): Double {
        return when (staff.type) {
            "Visiting" -> staff.department.name.length * 50.0 // Dummy calculation
            "Academic" -> staff.department.name.length*130.0
            "Academic" -> 10000.0
            else -> 3000.0 // Fixed salary for simplicity
        }
    }
}
