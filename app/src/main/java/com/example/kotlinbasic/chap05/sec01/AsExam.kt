package com.example.kotlinbasic.chap05.sec01

fun main() {
    val userId = 1001
    var idCheck: String? //null 가능 String?

    //idCheck = userId as String? //ClassCastEception 예외 발생

    /**위와 같이 상호 변환할 수 없어 런타임에서 발생하는 ClassCastException을
     * 사전에 막기 위해 "안전 타입 변환 연산자"인 "as?" 연산자를 사용
     * - as? 연산자는 casting을 시도하고, casting이 불가능 하면 null을 반환
     */
    idCheck = userId as? String?
    println("idCheck : $idCheck")//idcheck : null
}