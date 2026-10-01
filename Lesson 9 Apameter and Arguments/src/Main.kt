fun isValidMark (mark :Int):Boolean{
    if(mark<0 || mark >100){
        return false
    }
    else{
        return true
    }
}


fun calculateTotals(
    math: Int,
    english: Int,
    computer: Int
):Int{
    return math + english + computer
}

fun calculateAverage( total: Int): Double{
    return total/3.0
}

fun getGrades( average:Double): Char{
    return when{
        average >=80 -> 'A'
        average >=70 -> 'B'
        average >=60 -> 'c'
        average >=50 -> 'D'
        else -> 'F'
    }
}

fun isPass (average: Double): Boolean{
    return average >= 50
}

fun main(){

    println("Please enter the following")
    println("Name: ")
    var name = readln()
    var maths: Int
    var english: Int
    var computer: Int

        while(true){
            println("Maths marks:")
            maths = readln().toInt()
            if (isValidMark(maths)){
                break
            }else{
                println("Invalid marks")
                print("Enter again")
            }
        }
        while(true){
            println("English marks:")
            english = readln().toInt()
            if (isValidMark(english)){
                break
            }else{
                println("Invalid marks")
                print("Enter again")
            }
        }
        while(true){
            println("Computer marks:")
            computer = readln().toInt()
            if (isValidMark(computer)){
                break
            }else{
                println("Invalid marks")
                print("Enter again")
            }
        }


    println("======================================")
    println("            STUDENT REPORT")
    println("======================================")
    println("Name: $name")
    println("Maths: $maths")
    println("English: $english")
    println("computer: $computer \n")

    var totals = calculateTotals(maths, english, computer)
    println("Totals: $totals")
    var average = calculateAverage(totals)
    println("Average: $average")
    println("Grade: ${getGrades(average)}")
    if(isPass(average)){
        println("Result: Pass")
    }else{
        println("Result: Failed")
    }
    println("======================================")

}