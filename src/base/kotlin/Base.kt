package base.kotlin


open class Person(val name: String) { // primary constructor
    var age: Int = 0
        set(value) {
            println("set age ")
            field = value
        }
        get() {
            println("get age")
            return field
        }
}

//默认为final
class Student(name: String): Person(name) { // primary constructor

    constructor(name: String, age: Int):this(name) {
    }
}

enum class Color {
    RED,
    BLUE,
    YELLOW
}