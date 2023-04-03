package com.example.kotlinbasic.chap01.sec01.sec02

fun main() {
    //일반 변수 (mutable variable) 선언
    var a: Int = 100
    var b = 200 //추론된 자료형
    var c: Int

    //불변 변수 (immutable variable) 선언
    val d: Int = 1000
    val e = "Kotlin"

    println("a: $a")
    println("b: $b")

    //println(c)//error, Variable 'c' must be initialize
    c = a + b
    println("c: $c")
    println("a+b = ${a+b}")

    //d = 2000 //error, val cannot be reassigned
    println("d: $d")
    println("e: $e")

    var flag = true
    println("flag: $flag")

    flag = false
    println("flag: $flag")

    var flag2 = "true"
    println("flag2: ${flag2.toBoolean()}")
}