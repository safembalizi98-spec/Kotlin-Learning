fun main(){

    println("====CALCUALTOR====")
    println(" 1. Addition")
    println("2. Subtraction")
    println("3. Multiplication")
    println("4. Division")

    println("Choose an operation: ")

    var operation = readln().toInt()

    var choosenOperator =when(operation){
        1 -> "You have choosen addition"
        2 -> "You have choosen subtraction"
        3 -> "You have choosen multiplication"
        4 -> "You have choosen division"
        else -> "Invalid operation"
    }
    println(choosenOperator)

    println("Enter the first number: ")
    var firstNumber = readln().toInt()

    println("Enter the second number: ")
    var secondNumber = readln().toInt()

    var result = when(operation){
        1 -> firstNumber + secondNumber
        2 -> firstNumber - secondNumber
        3 -> firstNumber * secondNumber
        4 -> firstNumber / secondNumber
        else -> "Invalid operation"
    }

    println(result)
}