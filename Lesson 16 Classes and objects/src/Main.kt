class Student(
    val name: String,
    val age: Int,
    val mark: Int
) {
    fun isPassed(): Boolean {
        return mark >= 50
    }

    fun getGrade(): String {
        return when {
            mark >= 80 -> "A"
            mark >= 70 -> "B"
            mark >= 60 -> "C"
            mark >= 50 -> "D"
            else -> "E"
        }
    }

    fun displayReport() {
        println("Student: $name")
        println("Age: $age")
        println("Mark: $mark")
        println("Grade: ${getGrade()}")
        println("Passed: ${isPassed()}")
    }

}

val students =listOf(
    Student("John Smith", 28, 80),
    Student("John Deo", 17, 91),
    Student("Mary", 18, 45),
    Student("Amina",17,84 ),
    Student("Peter",18,63)
)

fun main(){
    students.forEach{
        it.displayReport()
        println()
    }

    println("Number of students: ${students.size}")

    var passed = students.filter{
        it.mark >=75
    }
    println("Students who passed:")
    passed.forEach {
        println("${it.name} is ${it.mark}")
    }

    var studentAbove80 = students.filter{
        it.mark >= 80
    }.map{
        it.name
    }

    println("Students who scored 80+: $studentAbove80")

    val highestMark = students
        .maxOfOrNull {
        it.mark
    }
    println("Highest mark: $highestMark")

    val sortedList =students.sortedByDescending{
        it.mark }
    sortedList.forEach {
        println("${it.name} is ${it.mark}")
    }

val marks =students.map{
    it.mark
}
 val average = marks.average()
    println("Average: $average")

}