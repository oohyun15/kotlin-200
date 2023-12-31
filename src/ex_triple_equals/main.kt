package ex_triple_equals

fun main(args: Array<String>)
{
    var a = "one"
    var b = "one"

    println(a === b) // true

    b = "on"
    b += "e"
    println(a !== b) // true | string concatenation으로 생성된 string은 object id가 다름

    b = a
    println(a === b) // true
}
