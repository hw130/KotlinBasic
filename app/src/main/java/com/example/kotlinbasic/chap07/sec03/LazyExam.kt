package com.example.kotlinbasic.chap07.sec03

import android.accounts.Account

fun main() {
    //account 객체 생성
    val account = Account()

    /** 사용 시점에 초기화(지연 초기화) */
    println(account.balance) //balance 속성값 초기화(balance = 1000)
    println("=====================")
    println("account.balance: ${account.balance}") //이미 초기화된 값 출력
}

class Account(){
    init {
        println("init block")
    }

    val balance: Int by lazy {
        print("setting balance")
        10000//lazy 반환값
    }
}