@file:JvmName("StringFunctions")

package base.kotlin

import java.sql.Savepoint

//Getting rid of static utility classes: top-level functions and properties


fun <T> joinToString(collection: Collection<T>, separator: String,
                     prefix: String, postfix: String): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> Iterable<T>.joinToStringBuilder(stringBuilder: StringBuilder, separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "...", callback: ((T) -> Unit)? = null): StringBuilder {
    return joinTo(stringBuilder, separator, prefix, postfix, limit, truncated) {
        if (callback == null) return@joinTo it.toString()
        callback(it)
        ""
    }
}


fun <T> Collection<T>.joinToStringBuilder(separator: String = ": ", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0)
            with(result) {
                append(separator)
                append(element)
            }
    }
    result.append(postfix)
    return result.toString()
}

/**
 *
 *
 * 默认参数
 * joinToString(list, separator = " ", prefix = " ", postfix = ".")
 * joinToString(list)
 *
 *
 */

//扩展方法
fun String.lastChar(): Char = this[this.length - 1]

/**
 *
 * public static final char lastChar(@NotNull String $receiver) {
        return $receiver.charAt($receiver.length() - 1);
   }
 */


open class View {
    open fun click() = println("View clicked")
}
class Button: View() {
    override fun click() = println("Button clicked")
}

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

// extend Property
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }


fun SaveUser() {
    fun inner() {

    }
    inner()
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff() //静态解析  I'm a view!
}
