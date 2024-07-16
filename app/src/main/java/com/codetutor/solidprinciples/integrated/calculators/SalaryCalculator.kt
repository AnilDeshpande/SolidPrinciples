package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

interface SalaryCalculator {
    fun calculateSalary(staff: Staff): Double
    fun generatePaySlip(staff: Staff): String
    fun applyBonus(staff: Staff, bonus: Double): Double
    fun deductTaxes(staff: Staff, tax: Double): Double
}
