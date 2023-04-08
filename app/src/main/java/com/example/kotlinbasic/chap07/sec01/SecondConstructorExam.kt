package com.example.kotlinbasic.chap07.sec01

fun main() {

}

class Custom(_name: String){
    var name: String = _name
    var tel: String = ""
    var type: Int = 0

    init {
        println("기본 생성자 호출")
    }

    constructor(_name: String, _tel: String): this(_name){
        this.tel = _tel

        println("보조 생성자(매개변수 2개) 호출")
    }

    constructor(_name: String, _tel: String, _type: Int): this(_name, _tel){
        this.type = if(_type<4) _type else 4

        println("보조 생성자(매개변수 3개) 호출")
    }
}