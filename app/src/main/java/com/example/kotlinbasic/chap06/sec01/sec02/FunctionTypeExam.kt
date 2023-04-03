package com.example.kotlinbasic.chap06.sec01.sec02

fun main() {
    println(isOdd(7))
}

/** 일반 함수 **/
fun isOdd(x: Int): Boolean{
    return x % 2 != 0
}

/** 함수 타입(function type) */
/** 1. 함수(익명)를 변수에 저장 */
val isOdd2: (Int) -> Boolean = fun(x: Int): Boolean {return x % 2 != 0} //홀수 check
val isOdd3: (Int) -> Boolean = fun(x) = x % 2 != 0
val isOdd4 = fun(x: Int): Boolean = x % 2 != 0 //함수 타입 생략
val isOdd5: fun(Int) = x % 2 != 0 //람다식

val isOdd6: (Int) -> Boolean = {x -> x % 2 != 0} //람다식

/** name을 매개변수로 받 콘솔에 출력하는 함수(반환타입 없음(Unit) */
val printName: (String) -> Unit = fun(name){
    println("My name is '$name'!")
}

/** 고차 함수(higer-order dunction) */
fun highOrderFunc(sum: (Int, Int) -> Int, x: Int, y: Int): Int = sum(x,y) //invoke()

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int) {
    
}