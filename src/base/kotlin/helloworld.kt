package base.kotlin

fun printHello(w: String) {
    println("hello $w!")
}

fun main(args: Array<String>) {
    printHello("world")
    val person = Person("xx")
    person.age = 4
    person.age
    println(getColor(Color.RED))

    for (c in 'A'..'F') {
        println(c)
    }

}

fun getColor(color: Color) =
        when (color) {
            Color.RED -> "red"
            Color.BLUE -> "blue"
            Color.YELLOW -> "yellow"
        }