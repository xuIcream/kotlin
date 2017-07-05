package base.kotlin

import kotlin.collections.List

//fun <T> isA(value: Any) = value is T
//Error: Cannot check for instance of erased type: T

/**
 * value is T -----> value is Any
 *
 * 泛型运行是擦除 List<String> 在运行是为 List
 * */

inline fun <reified T> isA(value: Any) = value is T

fun main(args: Array<String>) {
    println(isA<String>("abc"))


    val ints = mutableListOf(1, 2, 3)

    val mutableList: MutableList<Number> = MutableList<Number>(10){1}

    copyData(ints, mutableList)

    val head: Herd<Anim> = Herd<Cat>()
    val headin: HerdIn<Cat> = HerdIn<Anim>()

    feedAll(Herd<Cat>())

}

interface Producer<out T> {
    fun produce(): T
}

fun <T> copyData(source: MutableList<T>, destination: MutableList<in T>) {
    destination += source
}

open class Anim {
    fun feed() {
    }
}

class Cat : Anim() {
}

class Herd<out T : Anim> {
}

class HerdIn<in T : Anim> {
}


fun feedAll(animals: Herd<Anim>) {

}
