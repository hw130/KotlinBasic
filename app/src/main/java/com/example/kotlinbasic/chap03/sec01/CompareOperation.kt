package com.example.kotlinbasic.chap03.sec01

fun main() {
    var a = 10; var b = 10; var c = 100

    println("a==b : ${a==b}") //true
    println("a.eqauls(c) : ${a.equals(c)}") //false
    println("a!=b : ${a!=b}") //false
    println("!(a.equals(c)) : ${a.equals(c)}")//true

    println("c>a : ${c>a}")//true
    println("a>b : ${a>b}")//false
    println("a>c : ${a>c}")//false

    println("c.compareTo(a) > 0 : ${c.compareTo(a)}")//1, 크면 양수값(compareTo()반환값 Int)
    println("a.compareTO(b) > 0 : ${a.compareTo(b)}")//0, 같으면 0
    println("a.compareTo(c) > 0 : ${a.compareTo(c)}")//-1, 적으면 음수값
}