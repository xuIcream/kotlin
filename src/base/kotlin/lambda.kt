package base.kotlin

val sumA = { x: Int, y: Int -> x + y }
val sum: (Int, Int) -> Int = { x, y -> x + y }

fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("the result is $result")

}

val canBeInClub27 = { p: Person -> p.age <= 27 }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
    listOf(1, 2, 3, 4).asSequence().map {  }.filter { true }.toList()
}

//Executing sequence operations: intermediate and terminal operations
