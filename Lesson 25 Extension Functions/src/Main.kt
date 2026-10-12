data  class Student(
    val name:String,
    val mark: Int
)

fun Student.hasPassed():Boolean{
    return mark >= 50
}

fun Student.grade(): String {
    return when{
        mark >= 80 -> "A"
        mark in 70..79 -> "B"
        mark in 60..69 -> "C"
        mark in 50..59 -> "D"
        else -> "E"
    }
}

fun List<Student>.classAverage() : Double{
    if (isEmpty()){
       return 0.0
    }
    return this.map { it.mark.toDouble()}.average()
}

fun Student.isTopPerformer(): Boolean{
    return mark >= 80
}

fun main(){

    val student = Student ("Felix", 40)
    print("${student.name} has : ")
    if (student.hasPassed()) {
        println("Passed")
    }
    else{
        println("Not passed")
    }

    println("Grade: ${student.grade()}")

    val studentList =listOf(
        Student("Felix", 40),
        Student("Otieno", 90),
        Student("Maria", 90),
        Student("Ogila", 78)
    )

    println("=========== STUDENT LIST ===========")
    studentList.forEach {
        println(it.name)
    }
    println("=====================================")

    println("Average marks is ${studentList.classAverage()}")

    val topStudent = studentList.filter{
        it.isTopPerformer()
    }

    println("Top performers include:")
    topStudent.forEach {
        println(it.name)
    }
}