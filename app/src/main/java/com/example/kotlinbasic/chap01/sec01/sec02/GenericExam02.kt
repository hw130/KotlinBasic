package com.example.kotlinbasic.chap01.sec01.sec02

/* 클래스 선언부에 2개의 제네릭 형식 타입 지정*/
class GenericEx03<T,A> {
    //각 프로퍼티의 타입을 선언된 형식 타입으로 선언
    var userId: T? = null
    var score: A? = null
}

fun main() {
    //객체를 생성하면서 어떤 타입으로 사용할 것인지 타입 지정
    val obj: GenericEx03<String, Int> = GenericEx03()

    //프로퍼티에 지정된 타입에 맞는 데이터 할당
    obj.userId = "ugkang"
    obj.score = 100

    println("userId: ${obj.userId}, score: ${obj.score}")
}