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

    var b: Long = 2
    for (c in 'A'..'F') {
        println(c)
    }
    val list = listOf(1, 2, 3)

    joinToString(list, separator = " ", prefix = " ", postfix = ".")

    val str = "hello world!"
    println(str.lastChar())

}

fun getColor(color: Color) =
        when (color) {
            Color.RED -> "red"
            Color.BLUE -> "blue"
            Color.YELLOW -> "yellow"
        }