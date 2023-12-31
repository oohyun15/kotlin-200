package ex_member_function

class Building
{
    var name = "" // 건축명
    var date = "" // 건축일자
    var area = 0 // 면적(m^2)

    fun print()
    {
        println("이름: " + this.name)
        println("건축일자: " + this.date)
        println("면적: ${this.area} m^2")
    }
}
