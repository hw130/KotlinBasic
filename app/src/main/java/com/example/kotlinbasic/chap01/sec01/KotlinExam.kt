package com.example.kotlinbasic.chap01.sec01

import java.lang.reflect.Type

fun main() {
    println("hello kotlin")
}

fun maskMsg1 (msgType: Int ): String {
    return if (msgType == 1) {
        "대한민국"
    } else {
        "KOREA"
    }
}

fun maskMsg2(msgType: Int) : String {
    return if (msgType == 1) "대한민국" else "KOREA"
}

fun makeMsg3(msgType: Int) : String = if (msgType == 1) "안녕!" else "Hi~!"

fun makeMsg4(msgType: Int) = if (msgType == 1) "코틀린" else "Kotlin"
