package com.example.kotlinbasic.chap03.sec01

fun main() {
    val num = arrayOf(100,200,300,400,500)
    println("${200 in num}")//true
    println("${num.contains(200)}")//true
    println("${200 !in num}")//false
    println("${!num.contains(200)}")//false

    //for-in 반복문
    for(i in num){
        print("$i, ")
    }
}