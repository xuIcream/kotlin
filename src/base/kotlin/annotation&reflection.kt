package base.kotlin

import kotlin.reflect.KProperty1
import kotlin.reflect.full.findAnnotation
import kotlin.reflect.full.memberProperties


@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

@Target(AnnotationTarget.PROPERTY)
annotation class JsonName(val name: String)


/**
 * at this time it does not provide a comprehensive replacement for the Java reflection API
 * KClass, KCallable, KFunction, KProperty
 *
 */

fun main(args: Array<String>) {
    val kClass = Person::class
    kClass.memberProperties.forEach { println(it.name) }

    val person = Person("xxxx", 12)
    val memberProperty = Person::age
    memberProperty.invoke(person)
    println(serialize(person))
    val kFunction = ::foo
    kFunction.call(43)
}

fun foo(x: Int) = println(x)

fun serialize(obj: Any): String = buildString { serializeObject(obj) }

private fun StringBuilder.serializeObject(obj: Any) {
    obj.javaClass.kotlin.memberProperties.filter { it.findAnnotation<JsonExclude>() == null }
            .joinToStringBuilder(this, prefix = "{", postfix = "}") {
                serializeProperty(it, obj)
            }
}

private fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any) {
    val jsonNameAnn = prop.findAnnotation<JsonName>()
    val propName = jsonNameAnn?.name ?: prop.name
    serializeString(propName)
    append(": ")
    val value = prop.get(obj)
    serializePropertyValue(value)
}

private fun StringBuilder.serializePropertyValue(value: Any?) {
    when (value) {
        null -> append("null")
        is String -> serializeString(value)
        is Number, is Boolean -> append(value.toString())
        is List<*> -> serializeList(value)
        else -> serializeObject(value)
    }
}

private fun StringBuilder.serializeList(data: List<Any?>) {
    data.joinToStringBuilder(this, prefix = "[", postfix = "]") {
        serializePropertyValue(it)
    }
}

private fun StringBuilder.serializeString(s: String) {
    append('\"')
    s.forEach { append(it.escape()) }
    append('\"')
}

private fun Char.escape(): Any =
        when (this) {
            '\\' -> "\\\\"
            '\"' -> "\\\""
            '\b' -> "\\b"
            '\u000C' -> "\\f"
            '\n' -> "\\n"
            '\r' -> "\\r"
            '\t' -> "\\t"
            else -> this
        }