package com.example.kotlinbasic.chap05.sec01
//non null

fun main() {
    ignoreNulls("Kotlin")
}

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!! //s가 null 아님을 선언
    println("sNotNull.length: ${sNotNull.length}")
}