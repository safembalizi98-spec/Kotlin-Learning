fun main() {

    var marks = 0
    var totalMarks = 0
    var numberOfStudents = 0
    var highestStudent = 0
    var lowestStudent =0

    println("=====STUDENT MARKS=====")
    for (i in 1..5){
        print("Enter marks fo student $i:")
        marks =readln().toInt()
        totalMarks += marks
        numberOfStudents =i
        if(highestStudent <= marks){
            highestStudent = marks
        }

        if(lowestStudent == 0){
            lowestStudent = marks
        }
        if(lowestStudent >= marks){
            lowestStudent = marks
        }

    }


    var averageMarks = totalMarks.toDouble()/numberOfStudents

    println("=============================")
    println("Total Marks: $totalMarks")
    println("Average Marks: $averageMarks")
    println("The highest Student Marks: $highestStudent")
    println("The lowest Student Marks: $lowestStudent")

    println("============================")

}