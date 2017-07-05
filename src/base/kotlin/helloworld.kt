package base.kotlin

fun printHello(w: String) {
    println("hello $w!")
}

fun main(args: Array<String>) {

    for (c in 'A'..'F') {
        println(c)
    }
    val list = listOf(2, 1, 3)
    list.sortedBy { it }

    joinToString(list, separator = " ", prefix = " ", postfix = ".")

    val str = "hello world!"
    println(str.lastChar())

    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy { p: Person -> p.age }
    people.maxBy { it.age }
    people.forEach { print(it) }


    val aa = 3
    val bb = 4
    max(aa, bb)
    val cc: Int? = 5
    //max(aa, cc)

    var x: String = "aa"
    val y: String? = x
    //val z: String = y

    remove(0)

}


fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {

}

fun removeAt(index: Int) {
}
