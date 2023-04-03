package com.example.kotlinbasic.chap03.sec01

import com.google.android.material.color.utilities.Score

fun main() {
    val v1: Int = 100; val v2: Int = 200; val v3: Int = 100
    println("v1 == v2 : ${v1 == v2}")//false, 두 변수값 비교(equals() 오버라이딩)
    println("v1.equals(v3) : ${v1.equals(v3)}")//true, 두 변수값 비교
    println("v1 != v2 : ${v1 != v2}")//true, 두 변수값 비교(equals() 오버라이딩)

    val obj1 = Score(100, 200); val obj2 = Score(300,400)
    val obj3 = Score(100,200)

    /**데이터 클래스 비교 연산자
     * -data class는 컴파일러가 equals() 함수를 자동으로 오버라이딩 하여 비교
     */
    println("obj1 == obj2 : ${obj1 == obj2}")//false, 두 객체간 속성값 비교
    println("obj1 = obj3 : ${obj1==obj3}")//true, 두 객체간 속성값 비교
    println("obj1.equals(obj3) : ${obj1.equals(obj3)}")//true, 두 객체간 속성값 비교
    println("obj1 == obj3 : ${obj1==obj3}")//false,두 객체간 참조값 비교
    println("obj1 === obj3 : ${obj1 === obj3}")//false, 두 객체의 참조값 비교
    println("obj1 !== obj3 : ${obj1 !== obj3}")//true, 두 객체간 참조값 비교]

    var nullTest: String? = "Kotlin"
    //nullTest = null
    //?. : Safe call 연산자 => null이 아니면 nullTest?.length 반환, null이면 null반환
    println("nullTest?.length : ${nullTest?.length}")

    //?: Elvis 연산자 => null이 아니면 ?: 왼쪽 피연사 값을 반환, null이면 오른쪽 피연산자 값을 반환
    val length = nullTest?.length ?: -1
    println("length : ${length}")
}

//data class
data class Score(val a: Int, val b: Int){}