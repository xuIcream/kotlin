package base.kotlin

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

//扩展方法
fun String.lastChar(): Char = this[this.length - 1]

/**
 *
 * public static final char lastChar(@NotNull String $receiver) {
        return $receiver.charAt($receiver.length() - 1);
   }
 */




