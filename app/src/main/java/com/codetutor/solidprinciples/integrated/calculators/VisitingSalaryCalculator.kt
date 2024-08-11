package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

class VisitingSalaryCalculator : SalaryCalculator {
    override fun calculateSalary(staff: Staff): Double {
        return staff.department.name.length * 100.0 // Dummy calculation for visiting staff
    }
}