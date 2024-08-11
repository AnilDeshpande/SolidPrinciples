package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

interface SalaryCalculator {
    fun calculateSalary(staff: Staff): Double
}

interface PayslipGenerator {
    fun generatePaySlip(staff: Staff): String
}

interface BonusApplier{
    fun applyBonus(staff: Staff, bonus: Double): Double
}

interface TDSCalculator{
    fun deductTaxes(staff: Staff, tax: Double): Double
}