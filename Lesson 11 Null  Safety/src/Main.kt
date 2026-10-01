fun display(name: String, age: Int, phone: String?, email: String?){

    println("=========== STUDENT PROFILE ============== \n")
    println(" Name: $name")
    println(" Age: $age")
    println(" Phone: ${phone ?: "Not provided"}")
    println(" Email: $email")

}

fun main(){

    val name: String ="Brian"
    val age: Int = 18
    var phone: String? = null
    var email:String? = "brian@example.com"

    display(name, age,phone,email)

    val nickname: String? = null

    println(nickname ?: "Not provided")

}