package ex_garbage_collection

fun main(args: Array<String>)
{
    var result = ""
    var i = 1

    while (i <= 100)
    {
        result += "$i " // NOTE: 힙 영역에 계속해서 문자열이 새로 생성됨. GC를 통해 적당한 시점에 시스템이 자동으로 쓰레기 string을 수거함
        i += 1
    }

    println(result)
}
