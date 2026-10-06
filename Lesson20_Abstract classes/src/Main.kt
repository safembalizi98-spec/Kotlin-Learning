abstract class Employee(
    val id: String,
    val name: String
){
    abstract fun displayRole()

    fun displayName(){
        println("Name: $name")
    }
}

class Developer(
    id: String,
    name: String,
    val programmingLanguage: String
): Employee(id, name){
    override fun displayRole(){
        println("$name is a programmer ")
    }

    fun  code(){
        println("Programming Language: $programmingLanguage")
    }
}

class Teacher(
    id: String,
    name: String,
    val subject: String
):Employee(id, name){
    override fun displayRole(){
        println("$name is a teacher ")
    }

    fun teach(){
        println("$name teaches $subject")
    }
}

fun main(){
     val developer = Developer(
         "2576",
         "Michael Jackson",
         "Kotlin"

     )

    val teacher = Teacher(
        "212",
        "Safe Lwamba",
        "Kiswahili"
    )

    teacher.displayRole()
    teacher.teach()

    developer.displayRole()
    developer.code()


    val employee: List<Employee> =listOf(
        developer,
        teacher,
    )

    for (employee in employee){
        employee.displayRole()
    }
}