data class Student (
    val name: String,
    val mark: Int
)

val students = listOf(
    Student("safe",56),
    Student("Elvis",78),
    Student("James", 90),
    Student("John",77),
    Student("Joe",77),

)

fun main(){
    println("======== CLASS PERFORMANCE =======")
    val totalNumberOfStudents = students.count()
    println("Total number of students: $totalNumberOfStudents")
    val totalMarks = students.map{it.mark}.sum()
    println("Total Marks: $totalMarks")
    val averageMarks = students.map{it.mark}.average()
    println("Average Marks: $averageMarks")
    val highestMarks = students.map{it.mark}.maxOrNull()
    println("Highest Marks: $highestMarks")
    val lowestMarks = students.map{it.mark}.minOrNull()
    println("Lowest Marks: $lowestMarks")

    println("\n")

    println("PASSED STUDENTS")
    val passedStudentName=students
        .filter { it.mark>=75 }
        .map { it.name }
        .joinToString(" ")


    println("Passed Students: ${passedStudentName}")

    val failedStudentName=students
    .filter { it.mark<74 }
    .map { it.name }
    .joinToString(" ")

    println("Failed Students: ${failedStudentName}")

    val studentsNames = students
        .map { it.name }
        .sorted()

    println("STUDENTS IN ALPHABETICAL ORDER")
    println(studentsNames)


}