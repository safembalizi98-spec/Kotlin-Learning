fun main(){

    var balance: Double
    var amount: Double

    println("Enter your account balance: ")
    balance =readln().toDouble()
    println("Enter the amount to withdraw: ")
    amount = readln().toDouble()

    val remainingBalance = balance - amount

    println("================================")
    println("       ATM SYSTEM")
    println("================================")

    if ( amount <= balance){
        println("Withdrawal successful")
        println("Remaining balance: Sh$remainingBalance")
    }
    else {
        println("insufficient funds")
    }

    println("=================================")
}