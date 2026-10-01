fun main() {

    val marks = listOf(45, 78, 62, 90, 93, 33, 85, 71, 49)

    val passed = marks.filter { mark ->
        mark >= 50
    }
    val failed = marks.filter { it < 50 }

    println("All marks: $marks")
    println("Passed: $passed")
    println("Failed: $failed")

    println("Number passed: ${ marks.count{ it >= 50}}")
    println("Number failed: ${failed.count{ it < 50}}")

    println("Highest: ${marks.maxOrNull()}")
    println("Lowest: ${marks.minOrNull()}")

    println("Sorted: ${marks.sorted()}")


    val average = marks.average()
    println("Average: $average")

   val marksAbove80 = marks.filter{
        it >= 80
    }

    println("Above 80: $marksAbove80")

    val marksAbove90=marks.any{
        it >= 90
    }

    println("Any student above 90: $marksAbove90")

    val didAllStudentsPass =marks.all{
        it >= 50
    }
    println("All students passed: $didAllStudentsPass")

    println("Student marks in descending order:${marks.sortedDescending()}")
}
