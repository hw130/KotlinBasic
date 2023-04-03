package com.example.kotlinbasic.chap03.sec01

fun main() {
    val obj1 = B()//객체 생성

    if (obj1 is A){
        println("A class Type")
    } else {
        println("Not A class Type")
    }

    if (obj1 is B){
        println("B class Type")
    } else{
        println("Not B Class Type")
    }
}

open class A()
class B: A() {}