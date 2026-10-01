data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun main(){
    val products = listOf(
        Product("Laptop", 75000.0, 2),
        Product("Mouse", 1500.0, 10),
        Product("Keyboard", 3000.0, 5)
    )
    println("Products ")
    products.forEach{
        println("${it.name} | price ${it.price} | quantity ${it.quantity}")
    }

    val productCostingMore5000 = products
        .filter{ it.price > 5000.0 }
        .map{ it.name}

    println("The product with a price more than Ksh. 5000 is the ${productCostingMore5000}")

    println("Below is a list of existing products:")
    val productNames = products.map{it.name}
    productNames.forEach{
        println(it)
    }

    products.maxByOrNull{
       it.price
    }


    println("Sorted list of products:")
    val sortedList = products.sortedByDescending{it.price}

    sortedList.forEach{
        println("${it.name} | price ${it.price} | quantity ${it.quantity}")
    }

    val totalValue =products.sumOf{
        it.price * it.quantity
    }

    println("Total Value is $totalValue")

}