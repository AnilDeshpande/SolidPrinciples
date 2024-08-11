package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

class AcademicSalaryCalculator : SalaryCalculator {
    override fun calculateSalary(staff: Staff): Double {
        return 3000.0 // Fixed salary for academic staff
    }
}