open class Person(
    val name: String,
    val age: Int,
){
    open fun introduction(){
        println("I am $name")
    }
    open fun displayRole(){
        println("I am a person with no specific role")
    }
}

class Student(
    name: String,
    age:Int,
    val school: String
): Person(name, age){
    override fun displayRole(){
        println("student")
    }
}

class Teacher(
    name: String,
    age:Int,
    val subject: String
): Person(name, age){
    override fun displayRole(){
        println(" teacher")
    }
}

fun main(){
    val listOfPerson = listOf<Person>(
        Student("John Smith",28,"Mbale"),
        Teacher("Edwin Okumu",28,"cs"),
        Student("Fidel Catrol",28,"TBEC"),
        Teacher("Mike Mr",28,"Kiswahili")
    )

    listOfPerson.forEach{
        print("${it.name}: ")
        it.displayRole()
    }
}