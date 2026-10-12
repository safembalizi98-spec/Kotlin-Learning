object schoolConfig{
    const val SCHOOL_NAME = "SLM ACademy"
    const val COUNTRY = "Nairobi"
    val maxMark = 100
    val passMark = 50


    fun display(){
        println("============= School Details ==============")
        println("School: $SCHOOL_NAME")
        println("Country: $COUNTRY")
        println("Max Mark: $maxMark")
        println("Pass Mark: $passMark")
    }
}

//class Student

class Student(
    val name: String,
    val mark: Int
){
    companion object{
        const val MAX_MARK = 100
        const val PASS_MARK = 50

        fun isValidMark(mark:Int):Boolean{
            return mark in 0 ..MAX_MARK
        }
    }
}

fun main(){

    schoolConfig.display()

    println(Student.MAX_MARK)
    println(Student.PASS_MARK)
    println(Student.isValidMark(75))
    println(Student.isValidMark(120))
}


