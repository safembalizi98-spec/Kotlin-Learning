fun calculateTotal(m1: Int, m2: Int, m3: Int): Int{
    return m1+m2+m3
}

fun calculateAverage(totals: Int): Double{
    return totals/3.0
}

fun getGrades (averages: Double):String{

    return  when (averages){
        in 80.00..100.00 -> "A"
        in 70.00..79.00 -> "B"
        in 40.00..69.00 -> "C"
        in 20.00..39.00 -> "D"
        else -> "F"
    }
}

fun result( averages: Double):String{
    return when {
        averages >= 80 ->"Pass"
        else ->"Fail"
    }
}

fun main (){

    println("Student name:")
    var name = readln()
    println("Marks 1:")
    var mark1 = readln().toInt()

    println("Marks 2:")
    var marks2 = readln().toInt()

    println("Marks 3:")
    var marks3 = readln().toInt()

    println("========== STUDENT REPORT ===========")
    println("")
    println("Student name: $name")
    println("Marks 1: $mark1")
    println("Marks 2: $marks2")
    println("Marks 3: $marks3")

    println("\n=======================================")
    var totals = calculateTotal(mark1, marks2, marks3)
    println("Totals: $totals")
    var average = calculateAverage(totals)
    println("Average: $average")
    println("grades ${getGrades(average)}")
    println("Result: ${result(average)}")


}