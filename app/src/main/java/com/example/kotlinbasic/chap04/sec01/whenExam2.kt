package com.example.kotlinbasic.chap04.sec01

fun main() {
    whenUsage(2,50,"서울특별시")
}

fun whenUsage(inputType: Int, score: Int, city: String){
    when(inputType){
        1 -> println("Type-1")
        2, 3 -> println("Type-2-3")
        else -> {
            println("Type-Unidentified")
        }
    }

    when(inputType){
        checkInputType(inputType) -> {
            println("Type normal")
        }
        else -> println("Type abnormal")
    }

    val start = 0; val end = 100;
    when(score){
        in start..(end / 4) -> println("be within 25%")
        50 -> println("average")
        in start..end -> println("be within range")
        else -> println("out of range")
    }

    /** when()과 is 연산자를 사용하여 1)city 변수의 타입이 String 인지 검사하고
     * String 이면 2) 문자열(city 변수의 값)의 맨 앞이 "서울"로 시작하는지 확인한 후
     * 3) 그 결과 (true or false)를 isSeoul 변수에 저장함(변수의 대입문으로 when 사용)
     */
    val isSeoul = when(city){
        is String -> city.startsWith("서울")
        else -> false
    }
    println(isSeoul)

    /** String 클래스의 함수들을 사용하여 city 변수의 문자열 값을 검사 */
    when{
        city.isEmpty() -> println("도시명이 없습니다.")
        city.substring(0,2) == "서울" -> println("city: $city")
        else -> println(city) //서울이 아니면
    }
}

fun checkInputType(inputType: Int): Int {
//    if(inputType in 1..3){
//        return inputType
//    }
//    return -1

    return if (inputType in 1..3) inputType else -1
}