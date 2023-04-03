package com.example.kotlinbasic.chap06.sec01.sec02

fun main() {
    val numArray = intArrayOf(7,8,9)

    val list = newIntList(1,2,3, *numArray, 5)
    println("list: $list")//[1,2,3,7,8,9,5]

    println("list.get(2) : ${list.get(2)}")

    list.set(0,100)
    println("list : $list")

    list.add(10)
    println("list : $list")

    list.remove(100)
    println("list : $list")

    varArgs(100,200,300)//인자 3개
    varArgs(100,200,300,400,500)//인자 5개
}

fun newIntList(vararg  t: Int): ArrayList<Int> {
    val result = ArrayList<Int>()

    for(i in t){
        print("$i, ")
        result.add(i)
    }
    println()
    return result
}

//가변 인자를 받는 함수
fun varArgs(vararg num: Int){
    for(i in num){
        print("$i, ")
    }
    println()
}