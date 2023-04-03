package com.example.kotlinbasic.chap06.sec01

fun main() {
    var userID: String? = getUserId()

    //sendNotification(userID)//error: Type mismatch.

    if(userID != null) sendNotification(userID)

    userID?.let { userID -> sendNotification(userID) }

    userID?.let { sendNotification(it) }

    userID.let { sendNotification(it) } ?: run { println("아이디가 없습니다!") }

    userID.let {
        println("$it 님에게 메세지를 보냈습니다.")
    }?: run {
        println("userID가 null입니다.")
    }
}

//사용자 id를 반환하는 함수(반환타입: Nullable String)
fun getUserId(): String?{
    return "user01"
    //return null
}

//사용자에게 알림 메세지를 보내는 함수
fun sendNotification(userID: String){
    println("$userID 님에게 알림 메세지를 보냈습니다.")
}