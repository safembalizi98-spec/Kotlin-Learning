fun main(){

    val  studentName = "John Deo"
    val totalFees = 50000
    val amountPaid = 35000

    val balance = totalFees - amountPaid

    val isFeeCleared =balance == 0


    println ("=========================")
    println("     STUDENT FEES")
    println("===========================")
    println("Learners name: $studentName")
    println("Total fees: $totalFees")
    println("Amount paid: $amountPaid")
    println("Balance: $balance")
    println("is fees cleared: $isFeeCleared")
    println("===========================")

}