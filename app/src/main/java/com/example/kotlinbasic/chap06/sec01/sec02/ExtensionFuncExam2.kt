package com.example.kotlinbasic.chap06.sec01.sec02

fun main() {
    var car = Car()

    println("차종: ${car.getBrandName()}")
    println("가격: ${car.getPrice()}")
}

class Car{
    fun getPrice(): Int{
        return 100
    }
}

fun Car.getBrandName(): String{
    return "BMW-780"
}