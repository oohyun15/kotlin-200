// unit type
fun main(args: Array<String>): Unit // 굳이 Unit을 적진 않아도 됨
{
    celsiusToFah(27)
}

fun celsiusToFah(celsius: Int): Unit
{
    println(celsius * 1.8 + 32)
}
