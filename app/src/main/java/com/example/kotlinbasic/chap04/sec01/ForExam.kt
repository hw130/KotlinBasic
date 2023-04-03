package com.example.kotlinbasic.chap04.sec01

fun main() {
    val item1 = arrayOf("사과", "복숭아", "배")

    for(item in item1){
        println("item1: $item1")
    }
    println()

    //배열의 indices 속성을 참조하여 배열에 저장된 요소의 인덱스값을 참조
    for(i in item1.indices){
        println("item1[$i : ${item1[i]}")
    }
    println()

    val item2 = listOf("서울", "경기", "인천")
    for(item in item2){
        println("item2: $item")
    }
    println()

    //List의 indices 속성을 참조하여 List에 저장된 요소의 인덱스값을 참조
    for(i in item2.indices){
        println("item2[$i] : ${item2[i]}")
    }
    println()

    var sum: Int = 0
    for(i in 1..10) sum += i
    println("sum: $sum")
    println()

    for(i in 1..10) print("$i, ")
    println()
    for(i in 10 downTo 1) print("$i, ")
    println()
    for(i in 1..10 step 2) print("$i, ")
    println()
    for(i in 10 downTo 1 step 2) print("$i, ")
}