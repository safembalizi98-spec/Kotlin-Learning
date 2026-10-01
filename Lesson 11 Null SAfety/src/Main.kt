fun displayPhone(phone: String?): String?{
    return phone?: "Not provided"
}

fun main(){
    val phone= "0707351042"
    val result = displayPhone(phone)
    println(result)
}