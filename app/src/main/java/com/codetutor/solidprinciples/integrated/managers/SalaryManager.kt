package com.codetutor.solidprinciples.integrated.managers

import com.codetutor.solidprinciples.integrated.Staff
import com.codetutor.solidprinciples.integrated.calculators.SalaryCalculator


class SalaryManager(private val calculators: Map<String, SalaryCalculator>) {
    fun calculateSalary(staff: Staff): Double {
        return calculators[staff.type]?.calculateSalary(staff)
            ?: throw IllegalArgumentException("No salary calculator found for type: ${staff.type}")
    }
}
