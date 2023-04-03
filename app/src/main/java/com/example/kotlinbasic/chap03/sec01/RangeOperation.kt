package com.example.kotlinbasic.chap03.sec01

import java.time.LocalDate

fun main() {
    val lowerAlphaRange = 'a'..'z'
    val numberRange = 1..100
    println("isLower: ${'d' in lowerAlphaRange}")//true
    println("isNumber: ${101 in numberRange}")//false
    println()

    //for 루프 반복처리
    for (i in 1..10) print("$i, ")
    println()
    for (i in 'a'..'z') print("$i, ")
    println()

    //날짜 범위 사용
    val start = LocalDate.now()//현재 날짜를 가져옴
    println("start: $start")
    //plusDays(15) : 인자로 전달된 값(주)을 현재 요일에 더한 날짜를 반환
    //ex) start.plusWeeks(1) : 현재 요일 + 1주의 날짜 반환
    println("add weeks : ${start.plusWeeks(1)}")
    println("add weeks : ${start..start.plusWeeks(1)}")
}