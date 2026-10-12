data class Product (
    val name: String,
    val price: Double,
    val quantity: Int
)

fun main(){
    val products = listOf(
        Product("Maize floor", 200.00, 2),
        Product("Oil",140.00,1),
        Product("Shoes",1300.00,1),
        Product("Trousers",600.00,1),
        Product("Belt",100.00,1)
    )

    println("Products I bought...")
    products.forEach {
        println(it.name)
    }

    val productMoreThan5000 = products
        .filter{
        it.price > 300.00
    }

    println("Products grater than Ksh 300")
  productMoreThan5000.forEach {
      println("${it.name} is ${it.price}")
  }

   val productNames = products.map{
        it.name
    }
   println("Products names I bought...")
    println(productNames)

    val productWithQuantityGreaterThan1 = products.filter{
        it.quantity >=2
    }

    println("Products with quantity greater than 1 is $productWithQuantityGreaterThan1")

    val totalStock = products.sumOf{
        it.quantity * it.price
    }

    println("Total stock is $totalStock")

    val expensiveProducts = products
        .filter {it.price > 300.00}
        .map{it.name}

    println("Expensive products I bought...")
    expensiveProducts.forEach {
        println(it)
    }
}