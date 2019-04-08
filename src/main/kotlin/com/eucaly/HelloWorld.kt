package com.eucaly

fun main(args : Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age = 19
    age = 20
    var weight = 44.8f
    var name : String
    name = "Eucaly"

}

class Human{
    fun hello() {
        println("Hello Kotlin.")
    }
}