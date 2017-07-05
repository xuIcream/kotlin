package base.kotlin

open class Animal(open val name: String)

data class Person(override val name: String) : Animal(name) { // primary constructor
    companion object {
        fun fromJSON(jsonText: String): Person = Person(jsonText)
    }

    var age: Int = 0
        set(value) {
            println("set age ")
            field = value
        }
        get() {
            println("get age")
            return field
        }

    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }


    operator fun plus(other: Person): Int {
        return age + other.age
    }
}


interface ExprA
private class NumA(val value: Int) : ExprA
private class SumA(val left: Expr, val right: Expr) : ExprA

fun eval(e: ExprA): Int =
        when (e) {
            is NumA -> e.value
            is SumA -> eval(e.right) + eval(e.left)
            else ->
                throw IllegalArgumentException("Unknown expression")
        }

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.right) + eval(e.left)
        }


fun main(args: Array<String>) {
    val person = Person("xx")
    person.age = 4
    person + Person("vvv")
    println(getColor(Color.RED))
}