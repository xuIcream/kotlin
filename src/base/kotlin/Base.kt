package base.kotlin

class Person(val name: String) {
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

enum class Color {
    RED,
    BLUE,
    YELLOW
}