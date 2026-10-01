fun main(){
    println("Enter product name:")
    val productName =readln()
    println("Enter the price")
    val price = readln().toDouble()
    println("Enter the quantity")
    val quantity = readln().toInt()

    val totals: Double = price * quantity

    println("===============================")
    println("      SHOP RECEIPT")
    println("===============================")
    println("Product: $productName")
    println("Price: $price")
    println("Quantity: $quantity")
    println("--------------------------------")
    println("Totals: $totals")
    println("===============================")


}