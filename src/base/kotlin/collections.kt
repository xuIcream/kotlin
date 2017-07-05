package base.kotlin


val set = setOf(1, 7, 53)
val list = listOf(1, 7, 53)
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")


fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)


    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    people.maxBy { p: Person -> p.age }
    people.maxBy { it.age }
    people.forEach { print(it) }
}
