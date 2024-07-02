package com.codetutor.solidprinciples.integrated.calculators

import com.codetutor.solidprinciples.integrated.Staff

interface SalaryCalculator {
    fun calculateSalary(staff: Staff): Double
}
