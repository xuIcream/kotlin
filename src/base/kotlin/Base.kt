package base.kotlin

//val -----> final
//var -----> not final
val aa:Int = 42
val bb = 42

//string templates
val name = "Kotlin"

fun maxA(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun maxB(a: Int, b: Int): Int = if (a > b) a else b

enum class Color {
    RED,
    BLUE,
    YELLOW
}

fun getColor(color: Color) =
        when (color) {
            Color.RED -> "red"
            Color.BLUE -> "blue"
            Color.YELLOW -> "yellow"
        }

fun main(args: Array<String>) {
    println("Hello, world!")
    println("Hello, $name!")
    println(getColor(Color.BLUE))

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

}