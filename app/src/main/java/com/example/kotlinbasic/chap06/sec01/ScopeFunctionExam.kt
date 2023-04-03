package com.example.kotlinbasic.chap06.sec01

//NoteBook 클래스 선언
class NoteBook(var model: String, var year: Int, var price: Int){
    fun getDiscount(){
        price -= 25
    }
}

//Student 데이터 클래스 선언
data class Student(
    var id: String = "",
    var name: String = "",
    var gpa: Float = 0.0f
){
    fun isGPA(): Boolean = gpa < 1.5f
}

fun main() {
    //NoteBook 인스턴스 생성
    var notebook = NoteBook("LG그램", 2023, 250)
    println("model: ${notebook.model}, year: ${notebook.year}, price: ${notebook.price}")

    /** apply: 특정 객체를 생성하면서 "초기화 과정"을 수행할 때 많이 사용
     - 람다식 인자로 생선한 객체(this)를 전달하며, 속성을 초기화 한 후 변경된 객체를 반환
     - 참조 연산자 없이 인스턴스 멤버 사용 가능
     */

    var myNoteBook = NoteBook("LG그램", 2023, 250).apply {
        model = "[New!] $model"
        getDiscount()
        println("model: $model, year: $year, price: $price")
    }
    println("model: ${myNoteBook.model}, year: ${myNoteBook.year}, price: ${myNoteBook.price}")

    /** iu 객체 생성 */
    val iu = Student()
    iu.id = "C2022001"
    iu.name = "아이유"
    iu.gpa = 4.5f
    println("ID: ${iu.id}, NAME: ${iu.name}, GPA: ${iu.gpa}")

    /** john 객체 생성 */
    val john = Student().apply {
        id = "C2022002"
        name = "john"
        gpa = 1.4f
        println("ID: $id, NAME: $name, GPA: $gpa")
    }

    val noteModel = myNoteBook.run {
        println("model: $model, year: $year, price: $price")
        "model: $model($year)"
    }
    println(noteModel)

    /** Safe Calls(?.) 연산자와 함께 사용 */
    val isAcademicProbation = john?.run{
        isGPA()
    }
    println("학사 경고: $isAcademicProbation")

    /**수신 객체(T) 없이 호출하는 형태(람다식 안에서 수신 객체를 명시) */
    val isAcademicWaring = run {
        iu.isGPA()
    }
    println("학사경고여부: $isAcademicWaring")

    /** with: run과 동일한 기능을 가지지만, 인스턴스를 참조연산자 대신,
     * 파라미터로 받아 처리
     */
    with(myNoteBook){
        println("model: $model, year: $year, price: $price")
    }
    

    val infoNoteBook = myNoteBook.let {
        "MyNoteBook => model: ${it.model}, year: ${it.year}, price: ${it.price}"
    }

    var myNoteBook2 = NoteBook("LG그램", 2023, 300).also {
        it.model = "[New! 2023] ${it.model}"
        it.getDiscount()
    }
    println("MyNoteBook2 => model: ${myNoteBook2.model}, price: ${myNoteBook2.price}")
}