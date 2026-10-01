import kotlin.system.exitProcess

fun displayMenu(): Int{

    var choice: Int
    println("========= STUDENT MANAGEMENT ========")

    println("1. Add Student")
    println("2. View Students: ")
    println("3. Search student: ")
    println("4. Remove Student:")
    println("5.Exit")

    println("Choice: ")
    choice =readln().toInt()


    return choice
}

fun addStudent( students: MutableList<String>){

    println("Please enter students name: ")
    val student =readlnOrNull()
    if (student == null){
        println("Student name is null")
        addStudent(students)
    }
    else{
        students.add(student)
        println(students)
        println("Student added successfully")

    }


}

fun viewStudents(students: List<String>){
    for (student in students){
        println(student)
    }

}

fun searchStudent(students: MutableList<String>){
    println("Please enter students name: ")
    val student = readlnOrNull()

    if (student == null){
        println("Student name is null")
    }else{
        println("THe Student present: ${students.contains(student)}")
    }
}

fun removeStudent(students: MutableList<String>){
    println("Please enter students name: ")
    val student = readlnOrNull()
    if (student == null){
        println("Students name is null")
    }else{
        students.remove(student)
    }
}

fun main(){
     var students = mutableListOf<String> ()



       do{
           var menuChoice = displayMenu()
           when(menuChoice){
               1 -> addStudent(students )
               2 -> viewStudents(students)
               3 -> searchStudent(students)
               4 -> removeStudent(students)
               5 ->println("Thank you for using our services")
               else -> println("There is no such choice")
           }
       } while(menuChoice != 5)



}