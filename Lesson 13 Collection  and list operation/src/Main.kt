fun main(args : Array<String>){
    val marks = listOf(60,70,34,98,78)

    val pass = marks.map{ mark ->
          mark* 2
    }

    print(pass)
}