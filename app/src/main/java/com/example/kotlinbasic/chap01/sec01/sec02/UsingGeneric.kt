package com.example.kotlinbasic.chap01.sec01.sec02


open class Animal {
    open fun shout() {
        println("Animal 은 소리를 냅니다.")
    }
}

class Dog: Animal(){
    override fun shout() {

        println("강아지가 멍멍 소리를 냅니다.")

    }
}
class Cat: Animal(){
    override fun shout() {

        println("고양이가 야옹 소리를 냅니다.")

    }
}

class UsingSuperclass(val t: Animal){
    fun doShouting(){
        t.shout()
    }
}

class UsingGeneric<T: Animal> (val t: T){
    fun doShouting(){
        t.shout()
    }
}

fun main() {
    //Non-Generic
    UsingSuperclass(Animal()).doShouting()
    UsingSuperclass(Dog()).doShouting()
    UsingSuperclass(Cat()).doShouting()

    println("===============================")

    //Generic
    UsingGeneric<Animal>(Animal()).doShouting() //Animal 객체를 인자로 전달하고, doShouting() 호출

    UsingGeneric(Dog()).doShouting() //Dog 객체를 인자로 전달하고, doShouting 호출
    UsingGeneric(Cat()).doShouting()
}