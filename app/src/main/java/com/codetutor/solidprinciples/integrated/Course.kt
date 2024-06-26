package com.codetutor.solidprinciples.integrated

class Course(
    val name: String,
    val tenure: Int?, // Duration for Undergraduate, Post Graduate; null for P.Hd, Post Doc
    val department: Department
)