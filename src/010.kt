// char type
fun main(args: Array<String>): Unit
{
    var ch: Char = 'A' // 2 bytes
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt()) // deprecated
    println(ch.code)
}
