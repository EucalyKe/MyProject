package com.eucaly

fun main(args : Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human(45.5f, 1.56f)
    println(h.bmi())
    /*var age = 19
    age = 20
    var weight = 44.8f
    var name : String
    name = "Eucaly"*/

}

class Human(var weight : Float, var height : Float, var name : String = "") {
    init {
        println("test $weight")
    }
//    constructor(name : String, weight : Float, height : Float) : this(weight, height)
    fun bmi() : Float {
        val bmi = weight / ( height * height)
        return bmi
    }
    fun hello() {
        println("Hello Kotlin.")
    }
}