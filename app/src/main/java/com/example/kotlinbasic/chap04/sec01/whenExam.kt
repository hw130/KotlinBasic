package com.example.kotlinbasic.chap04.sec01

fun main() {
    var x = 3
    /** x에 따라 해당 값으로 분기하여 처리하고 when문을 빠져나감
     * -자바의 switch-case문과 유사(break문이 필요 없음)
     */
    when(x){
        1 -> {
            println("x == 1")
        }
        2 -> {
            println("x == 2")
        }
        3 -> {
            println("x == 3")
        }
        else -> {
            println("x이 1,2,3이 아니다!")
        }
    }

    when(x){
        0,1 -> {//0 or 1, 쉼포(,)를 사용하여 여러 값을 검사
            println("x == 0 or 1")
        }
        2,3 -> {//2 or 3
            println("x == 2 or 3")
        }
        else -> {//!1,2,3
            println("x이 1,2,3이 아니다!")
        }
    }

    when(x){
        in 1..3 ->{
            println("x == 1 or 2 or 3")
        }
        in 4..6 -> {
            println("x == 4 or 5 or 6")
        }
        !in 1..6 -> {
            println("x == !(1,2,3,4,5,6")
        }
    }

    /* fun과 when 연계 사용
    - 함수 f1의 매개변수에 따라 when문 처리
    -함수의 리턴값의 데이터 타입(Int)는 추론할 수 있기 때문에 생략 가능
     */
    var x2 = f1(1); var x3 = f1(2)
    println("x2 : $x2")
    println("x3 : $x3")

    var x4 = f1(3); var x5 = f1(5)
    println("x4 : $x4")
    println("x5 : $x5")

}

//f1()함수 선언
fun f1(b1: Int): Int = when (b1){
    1 -> {
        100
    }
    2 -> {
        200
    }
    3 -> {
        300
    }
    else -> {
        100 + 200 + 300
    }
}