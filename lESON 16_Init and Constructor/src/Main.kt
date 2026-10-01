class Student(
    val name: String,
    val age: Int,
    var mark: Int
){
    init{
        require(name.isNotBlank())
        require(age > 0)
        require(mark in 1..100)
    }

    fun getGrade(): String{
        return when{
            mark in 75..100 -> "A"
            mark in 50..74 -> "B"
            mark in 25..49 -> "C"
            else -> "D"
        }
    }

    fun display(){
        println("$name | Age:$age | Mark:$mark | Grade:${getGrade()}")

    }
    fun updateMark(name:String,newMark: Int){

    }
}



fun main(){
    val students = mutableListOf(
        Student("John", 28, 28),
        Student("Smith", 28, 28),
        Student("Edwin", 28, 28),
        Student("Justin", 28, 28),
        Student("Gabriel", 28, 28),
    )



    val updateName = students.filter{
        it.name =="John"
    }.map{
        it.mark = 78
    }

    students.forEach {
        it.display()
    }

}