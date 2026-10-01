data class Student(
    val name: String,
    val marks: Int
)

val students = listOf(
    Student("Brian",78),
    Student("Mary", 91),
    Student("John", 64),
    Student("Elvis", 78),
    Student("Wangari", 79),
    Student("Aiden", 78)
)

fun getStudentList(names: List<Student>): List<String> {

    val list = names.map{it.name}
    return list
}

fun main(){

    val sortedStudents = students.sortedByDescending{ it.marks}
    sortedStudents.forEach{
        println("${it.name}: ${it.marks}")
    }

    val student = students.find{
        it.name == "Mary"
    }

    println(student?.marks)

    // above 75 performance...

    val passed = students.filter{
        it.marks > 74
    }

    val groups = students
        .groupBy{
       if(it.marks > 74) "passed" else "Failed"
    }


    println(groups)

    passed.forEach{
        println("${it.name} has ${it.marks} marks")
    }


    val lis= getStudentList(students)
    println(lis)
}