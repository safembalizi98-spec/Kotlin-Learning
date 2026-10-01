// a small school application...

open class Person(
    val name: String,
    val age: Int
)

interface Printable{
    fun header(){
        println("========Details========")
    }
    fun printDetails()
}

interface Attendable{
    fun markAttendance()
}

class Student(
    name: String,
    age: Int,
    val school: String
): Person(name, age), Printable, Attendable {
    override fun header() {
        println("===========Student Details ==============")
    }
    override fun printDetails(){
        header()
        println("Name: $name, Age: $age, School: $school")
        markAttendance()

    }
    override fun markAttendance() {
        println("Attendance: Present")
    }
}

class Teacher(
    name: String,
    age: Int,
    val subject: String
): Person(name, age), Printable, Attendable {
    override fun header() {
        println("===========Staff Details ==============")
    }
    override fun printDetails(){
        header()
        println("Name: $name, Age: $age, Subject: $subject")
        markAttendance()
    }
    override fun markAttendance() {
        println("Attendance: Present")
    }
}

fun main(){
    val student1 = Student("John", 35, "SLM")
    val teacher1= Teacher("Felix", 39, "Computer")

    student1.printDetails()
    teacher1.printDetails()
}