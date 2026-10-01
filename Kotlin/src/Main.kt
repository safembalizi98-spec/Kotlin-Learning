class NotificationManager(){

    var name: String? = null
    fun sendNotofication(address: String): String{
        println("Yo  $address")
        return "Notification sent to $name..."
    }

    fun getNextAddress(): String{
        return "johndeo@gmail.com"
    }
}

val notification: NotificationManager = NotificationManager().apply{
    name = "John Doe"
}


fun main(args:Array <String>){
    var results = notification.run {
        val address: String? =getNextAddress()
        val confirm = address?.let{
            sendNotofication(it)
        }
    }

    println(results)

}