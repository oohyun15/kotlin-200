package ex_function_reference

fun plus(a: Int, b: Int) = println("plus 호출됨 ${a + b}")

object Object
{
    fun minus(a: Int, b: Int) = println("Object의 minus 호출됨 ${a - b}")
}

class Class
{
    fun average(a: Int, b: Int) = println("Class average 호출됨 ${(a + b) / 2}")
}

fun main(args: Array<String>) {
    var instantFunc: (Int, Int) -> Unit
    instantFunc = ::plus // use `this::plus` until kotlin 1.1 ver
    instantFunc(60, 27)

    instantFunc = Object::minus
    instantFunc(36, 12)

    instantFunc = Class()::average
    instantFunc(25, 15)
}
