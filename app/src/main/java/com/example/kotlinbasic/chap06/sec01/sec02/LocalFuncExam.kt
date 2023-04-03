package com.example.kotlinbasic.chap06.sec01.sec02

import java.util.logging.Logger.global

var global = 10
fun main() {
    val x = 20
    val y = 30

    fun nestedFunc(){

    }
}

//최상위 함수
fun outsideFunc(){
    global += 1
    val z = 500
    println("outsideFunc z: $z")
    println("outsideFunc global: $global")
}