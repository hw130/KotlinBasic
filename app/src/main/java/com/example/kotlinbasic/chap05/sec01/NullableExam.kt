package com.example.kotlinbasic.chap05.sec01

fun main() {
    val s1: String? = null
    //val s2: String = null
    //val s3: String = s1
    val s4: String = "Kotlin"
    val s5: String? = s4

    var s6: Int? = null
    s6 = 100

    var s7: String? = "Kotlin"

    /** 변수 s7은 nullable type으로 null 값이 들어올 수 있음
     * 이와 같이 null 값이 들어올 수 있는 nullable type 변수를 사용할 때는
     * 반드시 null check를 한 후 사용해야 함(null check 없이 사용자 컴파일 error 발생)
     */
   // println(s7.length)//compile error

    /** 스마트 캐스트(smart cast) :
     * 변수 s7이 null이 아니라는 것을 컴파일러가 인식하고, String 타입으로 캐스팅하여
     * s7.length 속성 처리
     */
    if (s7 != null) println(s7.length) //null check 후 처리

    /**?. : safe call 연산자
     * -s7의 값이 null이 아닐 때만 s7?.length 실행하고, null이면 null 값을 반환
     */
    println(s7?.length)

    var s8: String? = "코틀린을 배우자"
    println(s8?.substring(5)?.length) //3, ("배우자")

    /** ?.연산자를 사용하지 않은 코드 */
    if (s8 != null){
        val b: String? = s8.substring(5)
        if(b != null){
            println(b.length)
        }
    }

    val s9 = s8?.length ?: 0
   // val s9: Int = if(s8 != null) s8.length else 0
    println("s9: $s9")
}