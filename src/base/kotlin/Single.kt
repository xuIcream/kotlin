package base.kotlin

class Singleton private constructor() {
    init { println("singleton init ") }
    companion object {
        val info = " info "
        val instance: Singleton by lazy { Singleton() }
    }
}

object Single {
    val info = "single info "
    init { println("Single init ") }
}


fun main(args: Array<String>) {
    println(Singleton.info)
    println("-------------------------------")
    Singleton.instance   // init
    println("-------------------------------")
    println(Single.info)
}
