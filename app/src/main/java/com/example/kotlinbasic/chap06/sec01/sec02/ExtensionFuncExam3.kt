package com.example.kotlinbasic.chap06.sec01.sec02

fun main() {

}

class ExtensionFuncExam3{
    val data: Int = 100

    fun infoFunc(){
        println("infoFunc() 호출")
    }
}
//확장 프로퍼티
val ExtensionFuncExam3.eData: Int
    get() = 200

//확장 함수
fun ExtensionFuncExam3.eFunc(){
    println("eFunc() 호출")
}