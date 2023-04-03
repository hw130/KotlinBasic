package com.example.kotlinbasic.chap01.sec01.sec02

import android.renderscript.Double4

fun main() {
    /* 1) arrayOf() 함수를 이용한 배열 생성-배열 선언과 동시에 초기화 */
    val itemString = arrayOf<String>("사과", "복숭아","배") //<String> 타입으로 초기화된 배열
    //val itemString= arrayOf<String>("사과", "복숭아","배") //명시적 타입 파라미터 생략
    for (fruit in itemString){
        println("fruit: $fruit")
    }
    println()

    val numArray = arrayOf<Int>(1,2,3,4,5)

    for(num in numArray){
        print("$num, ")
    }
    println()
    //다양한 타입의 값을 저장
    val itemAny = arrayOf("Kotlin", 100, "Java", 97, true)
    for (item in itemAny){
        print("$item, ")
    }
    println()

    //2) arrayOfNulls() 함수: null 값을 가지는 배열 생성(크기만 지정)
    val arr1 = arrayOfNulls<Int>(3) //크기가 3인 정수(Int) 타입 배열 생성
    arr1[0] = 10
    arr1[1] = 20
    arr1[2] = 30
    for(i in arr1){
        print("$i, ")
    }
    println()

    val arr2 = arrayOfNulls<String>(3) //크기가 3인 String 타입 배열 생성
    for(value in arr2){
        print("$value, ")
    }
    println()

    arr2[0] = "Kotlin"
    arr2[1] = "Java"
    arr2[2] = "Swift"
    for(value in arr2){
        println("arr2: $value")
    }

    checkArgs("Kotlin")
    checkArgs(100)
    checkArgs(100.0)
}

fun checkArgs(type: Any){
    when(type){
        is String -> println("Type is String: $type")
        is Int -> println("Type is int: $type")
        is Double -> println("Type is Double: $type")
    }
}