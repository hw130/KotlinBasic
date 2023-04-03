package com.example.kotlinbasic.chap03.sec01
//invoke 연산자

//Person 클래스 선언
class Person(val name: String){
    /** invoke() 함수 선언(overloading) */
    operator fun invoke(phone: String, email: String){
        println("name: $name, phone: $phone, email: $email")
    }
}

fun main() {
    /** Person 클래스의 인스턴스(객체) 생성 */
    val sony = Person("손흥민")
    println("name: ${sony.name}")//참조 변수를 통한 name 멤버 변수 access\

    /** invoke() 함수 호출 */
    sony.invoke("010-1234-1234", "sony@email.com")

    /** invoke() 함수 호출(이름 없이 간편 호출(인스턴스(참조변수)에 괄호() */
    sony("010-1234-1234", "sony@gmail.com")

    /** 람다식에서 invoke() 함수 호출
     * -람다식은 컴파일 하면서 invoke() 함수 정의하기 때문에
     * result.invoke() 또는 result() 로 간편 호출 기능(invoke 생략)
     */
    val intData = 100
    val result: () -> Int = {intData + 100}
    println("result: ${result.invoke()}")//invoke() 함수 호출
    println("result: ${result()}")//간편 호출
}
