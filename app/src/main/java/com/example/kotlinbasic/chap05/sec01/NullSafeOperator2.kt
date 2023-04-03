package com.example.kotlinbasic.chap05.sec01

fun main() {
    val president = Employee("김대표", null)
    val director = Employee("김부장", president)

    println(managerInfo(president))
    println(managerInfo(director))
}

class Employee(val name: String, val manager: Employee?)

/**Employee 객체의 멤버 변수 접근시 null 처리 **/
fun managerInfo(employee: Employee): String? = employee.manager?.name