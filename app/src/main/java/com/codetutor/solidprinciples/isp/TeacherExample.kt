package com.codetutor.solidprinciples.isp

interface Teacher {
    fun teach()
}
class MathTeacher : Teacher {
    override fun teach() {
        println("Teaching math")
    }
}
class ScienceTeacher : Teacher {
    override fun teach() {
        println("Teaching science")
    }
}
class SchoolClass(private val teachers: List<Teacher>) {
    fun startClass() {
        teachers.forEach { it.teach() }
    }
}
class TeachingSchedule(private val teacher: Teacher) {
    fun scheduleSession() {
        println("Scheduling a teaching session")
        teacher.teach()
    }
}