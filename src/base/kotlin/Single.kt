package base.kotlin

class Singleton private constructor() {
    companion object {
        fun getInstance() = Holder.instance
        val instance2 by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            Singleton()
        }
    }
    private object Holder{
        val instance = Singleton()
    }
}

object Single {
    val info = "single info "
    init { println("Single init ") }
}