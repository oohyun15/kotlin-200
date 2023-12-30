// parameter and argument
fun main(args: Array<String>): Unit
{
    println(ctoF(30))
    println(getAverage(89, 96))
}

fun ctoF(celsius: Int): Double
{
    return celsius * 1.8 + 32
}

fun getAverage(a: Int, b: Int): Double
{
    return (a + b) / 2.0
}
