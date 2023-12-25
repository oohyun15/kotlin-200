// comparison operator
fun main(args: Array<String>): Unit
{
    var isRight: Boolean = (10 + 70) > (3 * 25) // true
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10 + 20) // true
    println(isRight)

    isRight = 0.00001f == 0.0005f * 0.002f // false
    println(isRight)

    isRight = 3.0 * 5 + 2.7 <= 16 // 17.7 <= 16, false
    println(isRight)
}
