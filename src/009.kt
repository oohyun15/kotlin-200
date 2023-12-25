// trap of real number
fun main(args: Array<String>): Unit
{
    println(0.1f + 0.1f + 0.1f)
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f) // != 1.0
    println(0.1f * 10) // == 1.0
}