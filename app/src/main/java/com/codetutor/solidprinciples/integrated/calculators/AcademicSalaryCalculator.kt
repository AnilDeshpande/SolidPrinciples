package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

class AcademicSalaryCalculator : SalaryCalculator {
    override fun calculateSalary(staff: Staff): Double {
        return 3000.0 // Fixed salary for academic staff
    }
    override fun generatePaySlip(staff: Staff): String {
        throw UnsupportedOperationException("Can't generate PaySlip")
    }

    override fun applyBonus(staff: Staff, bonus: Double): Double {
        throw UnsupportedOperationException("Can't apply bonus")
    }

    override fun deductTaxes(staff: Staff, tax: Double): Double {
        throw UnsupportedOperationException("Can't deduct taxes")
    }
}