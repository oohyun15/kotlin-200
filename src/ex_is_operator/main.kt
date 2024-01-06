package ex_is_operator

import ex_inheritance.Person
import ex_inheritance.Student

class Professor(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>)
{
    val person: Person = Student("Mark Zuckerberge", 33, 20171225)
    print("${person is Person} ") // true
    print("${person is Student} ") // true
    print("${person is Professor} ") // false

    val person2: Person = Professor("Kim", 48)
    print("${person2 is Person} ") // true
    print("${person2 is Student} ") // false
    print("${person2 !is Professor} ") // false
}
