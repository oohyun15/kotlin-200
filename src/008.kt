// integer and real data type
fun main(args: Array<String>): Unit
{
    val a: Byte = 125
    val b: Short = (100 + 200) * 100
    var c: Int = 12_4354_6538
    c = 0xFF_88_88
    c = 0b01010010_01100011_01110101_01000101
    var d: Long = -543_7847_3984_7238_4723

    c = a + b // Int
    d = c + 10L // Long
    var e: Float = 67.6f
    val f: Double = 658.456
    e = (e + f).toFloat()
    println(e)
}
