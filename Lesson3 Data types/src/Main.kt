//Kotlin variables.....

fun main(){
    val name = "John Deo"
    val mathematics = 90
    val english = 80
    val Kiswahili = 80
    val science = 80
    val computer = 90

    val grade: Char = 'A'
    val passed: Boolean = true

    val totals = mathematics.plus(english).plus(Kiswahili).plus(science).plus(computer)

    val average = totals / 5.0

    println("================================")
    println("         REPORT CARD")
    println("================================")
    println("Name: $name")
    println("Mathematics: $mathematics")
    println("English: $english")
    println("Kiswahili: $Kiswahili")
    println("science: $science")
    println("computer: $computer")

    println("")
    println("---------------------------------")
    println("Total: $totals")
    println("Average: $average")

    println("=================================")
    println("Grade: $grade")
    println("Passed: $passed")



}