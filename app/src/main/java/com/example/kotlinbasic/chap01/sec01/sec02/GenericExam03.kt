package com.example.kotlinbasic.chap01.sec01.sec02

/** 함수 선언부 제네릭 형식타입<T>를 지정(제네릭을 Number 클래스 타입으로 한정)하고,
 * 이를 함수의 매개변수와 리턴값의 타입으로 지정
 * -Number class: 숫자를 표현하는 자료형(Int, Double, Float, Long, Short, Byte)의 super class
 */

fun <T: Number> getSum(num1: T, num2: T): T {
    /** 매개변수 num1, num2를 Double 타입으로 변환하여 연산하고,
     * 반환값은 제네릭 타입으로 변환하여 사용
     */
    return (num1.toDouble() + num2.toDouble()) as T
}

fun main() {
    //제네릭으로 선언된 getSum() 함수에 Int, Float, Double 값을 인자로 호출
    println(getSum(10, 20))//Int
    println(getSum(10.0f, 20.0f)) //Float
    println(getSum(10.0, 20.0)) //Double
}