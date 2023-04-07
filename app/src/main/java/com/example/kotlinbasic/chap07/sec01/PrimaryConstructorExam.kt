package com.example.kotlinbasic.chap07.sec01

fun main() {
    var obj1: Friend = Friend("손흥민", "010-1234-5678")
    println("이름: ${obj1.name}")
    println("전화: ${obj1.tel}")


}

class Friend constructor(_name: String, _tel: String){
    val name: String
    val tel: String

    init {
        this.name = _name
        this.tel = _tel
        println("멤버 속성이 초기화되었습니다.")
    }
}

class Friend2(_name: String, _tel: String){
    val name: String
    val tel: String
    init {
        this.name = _name
        this.tel = _tel
        println("멤버 속성이 초기화되었습니다.")
    }
}

class Friend3(_name: String, _tel: String){
    val name: String = _name
    val tel: String = _tel

    init {
        println("멤버 속성이 초기화되었습니다.")
    }
}

class Friend4(val name: String, val tel: String){
    init {
        println("멤버 속성이 초기화되었습니다 ==> name: ${this.name},tel: ${this.tel}")
    }
}

class Friend5(val name: String, val tel: String = "010-1234-5678"){
    init {
        println("멤버 속성이 초기화되었습니다.")
    }
}

class Friend6(val name: String, val tel: String, var type: Int = 1){
    init {
        this.type = if(type < 4) type else 4
        println("멤버 속성이 초기화되었습니다.")
    }
}