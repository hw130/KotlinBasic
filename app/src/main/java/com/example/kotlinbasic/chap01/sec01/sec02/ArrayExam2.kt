package com.example.kotlinbasic.chap01.sec01.sec02

import java.util.*

//Array 클래스의 생성자를 이용한 배열 생성(생성자 방식)
fun main() {
    /** Array 클래스 생성자를 이용한 배열 생성
     * -var arry = Array(size, {초기값}-초기값은 람다식으로 표현 가능
     * (람다식 초기값은 {init: (Int) -> T }로 정의되어 있으며,
     * 첫번쨰 요소부터 init 함수를 호출하여 반환값으로 초기값 설정)
     */

    val num = Array<Int>(10) {i -> i} //10개의 정수를 저장하는 배열을 생성하고 0~9로 초기화
    //== val num = Array(10, {i -> i})
    //== val num =Array<Int>(10) {it} //인자가 하나라면 it으로 받을 수 있다.
    for(value in num){
        print("$value, ")
    }
    println()

    //문자열로 변환하여 String 타입의 요소에 저장
    val num2 = Array<String>(10){it -> (it*2).toString()}

    for(value in num2){
        print("$value, ")
    }
    println()

    val num3 = Array(10){_ -> 0 } //매개 변수 'it'은 사용되지 않은 경우 _(으)로 바꿀 수 있음
    /* forEach문: 배열(데이터)의 크기 만큼 반복,
     -it 키워드로 배열의 요소값을 받음
     */
    num3.forEach { print("$it, ") }
    println()

    //배열의 요소를 문자열 형태로 변환(Arrays.toString(num4))
    val num4 = Array(10) {i -> i * 3}
    println("num4: ${Arrays.toString(num4)}") //num4 배열 값들을 Arrays.toString()으로 출력
    println("num4: ${num4.contentToString()}")//num4 배열을 값들을 contentToString()으로 출력
    
    //기본 타입 배열 클래스를 이용한 배열 생성
    val intItem: IntArray = intArrayOf(100,200,300)
    intItem.forEach { print("$it, ") }
    println()
    
    val intNum = IntArray(5){i -> (i)}
    intNum.forEach { print("$it, ") }
    println()

    val doubleNum = DoubleArray(5) {i -> (i).toDouble()}
    doubleNum.forEach { print("$it,") }
    println()

    doubleNum[0] = 100.0
    println("doubleNum[0]: ${doubleNum[0]}")
    println()
        
    //다차원 배열
    //2행 3열
    val array2D = Array(2) {Array(3){_ -> 0}}
    for(x in array2D.indices){ //행(0,1), indices 프로퍼티: 행의 인덱스 범위를 반환(0..1)
        for(element in array2D[x]){ //열(0,1,2)
            print("$element")
        }
        println()
    }
    println()

    val array2D2 = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
    for(x in array2D2.indices){ //행(0,1)
        for(element in array2D2[x])//열 (0,1,2){
            print("$element")//열 (0,1,2)
        }


}