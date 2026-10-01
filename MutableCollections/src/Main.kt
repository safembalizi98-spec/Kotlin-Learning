
fun addStudentAndMarks(students:MutableMap<String, Int>): MutableMap<String, Int>{
    println("Please add a student: ")
    val name =readln().uppercase()
    println("Please enter the marks:")
    val marks = readln().toIntOrNull()
    students[name] = marks?: 0
    println("Student $name and $marks added successfully")

    return students
}

fun viewStudents(students: MutableMap<String, Int>){
    var i = 1
    for(student in students.keys){
        println(" $i .$student")
        i +=1
    }
}

fun searchStudents(students: MutableMap<String, Int>,student:String): Boolean{
    return students.contains(student)
}

fun removeStudent(students: MutableMap<String, Int>, student:String): String {
    if (students.contains(student)){
        students.remove(student)
        return "Student  $student has been removed"
    }else{
        return ("Student $student does not exist")
    }
}

fun studentUpdate(students: MutableMap<String, Int>,student:String, update:String?, newMarks: Int?): String{
    if (students.contains(student)){
        if (update == null && newMarks != null){
            students[student] = newMarks
            return "marks updated updated."

        }else if(update != null && newMarks == null){
            students[update] = students.remove(student)!!
            return "Students name updated."

        }else if ( update != null && newMarks != null){
            students.remove(student)
            students[update] = newMarks

            return "Student details updated."
        }
        else{
            return "no updates available"
        }

    }else{
        return "Student $student does not exist"
    }
}


fun main(){

    var students = mutableMapOf<String, Int>()
    var ifRightChoice = true
    while( ifRightChoice ){


        println("========== STUDENT MANAGEMENT ===========\n")
        println("1. Add student and marks")
        println("2. View students")
        println("3. Search student")
        println("4. Remove student")
        println("5. Update student")
        println("6. Exit")

        println("Please choice  an option:")
        val choice = readln().toIntOrNull() ?: 0


        if (choice == 6){
            println("You have exited.")
            ifRightChoice = false
        }

            when(choice){
                0 -> {println("Please make the right choice between 1 to 6")}
                1 -> {
                    students = addStudentAndMarks(students)
                }
                2 -> {
                    viewStudents(students)

                }

                //not doing.....
                3 -> {
                    println{"Please enter the student you want to search for:"}
                    val isStudentPresent = readln()
                    val result = searchStudents(students, isStudentPresent)
                    println("Student present:$result")
                }
                4 -> {
                    println{"Please enter the student you want to remove:"}
                    val studentToRemove = readln().uppercase()

                    println(removeStudent(students,studentToRemove ))

                }
                5 -> {
                    println{"Please enter the student you want to update:"}
                    val studenttoUpdate = readln().uppercase()

                    println("To what name do you want to update:")
                    val update = readln().uppercase()

                    println("Would you like to change the marks too: ")
                    println("If not press enter to return to the main menu.")

                    val newMarks = readln().toIntOrNull() ?: 0


                    println(studentUpdate(students,studenttoUpdate,update, newMarks ))
                }
            }

    }


}