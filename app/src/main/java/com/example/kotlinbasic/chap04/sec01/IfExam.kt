package com.example.kotlinbasic.chap04.sec01

fun main() {
    var x = 100

    if(x == 100){
        println("x= $x")
    }else{
        println("x는 100이 아님")
    }

    /** if 문을 표현식으로 사용(간략화)
     * -if 문을 표현식 형태로 사용할 때는 반드시 하나의 결과값이 결정되어야 하므로
     * 항상 else문을 함꼐 사용
     */
    val msg = if (x == 100) "x == 100" else "x는 100이 아님"
    println(msg)

    println(if (x == 100) "x = 100" else "x는 100이 아님")
}