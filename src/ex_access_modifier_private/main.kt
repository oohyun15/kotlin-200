package ex_access_modifier_private

fun main(args: Array<String>)
{
//    num = 5 // raise error
    hello(15)

    val person = Person(10)
    println(person.age)
//    person.age = 20 // raise error

    println(person.isYoung)
}
