data class Student (
    val name: String,
    val age: Int,
    val mark: Int
)

fun main() {
    val students = listOf(
        Student("Brian", 18, 78),
        Student("Mary", 19, 91),
        Student("John", 20, 84),
        Student("Amina", 20, 84)
    )

    val (name, age, marks) = students[0]

    println("Name: $name\nAge: $age\nmarks: $marks")

    println("============== STUDENT INFORMATION ===============")

    students.forEach { (name, age, marks) ->

            println("Name: $name Age: $age Marks: $marks")

    }

    println("============= STUDENT NAME AND MARKS==============")
    students.forEach{(name, _,marks) ->

        println("Name: $name  Marks: $marks")
    }
}