//scope function temporarily creates a context around an object...
// Let,run,apply(configure and object), also, with


data class Product(
    var name: String,
    var price: Double,
    var quantity: Int
)

fun main(){
    val product = Product("Laptop",50000.00, 3 )

    product.let{
        println("Product : ${it.name}")
        println("Product: ${it.price}")
    }

    val totalValue = product.run{
        price*quantity
    }
    println("Total Value : $totalValue")


    val productKeyboard = Product("", 0.0, 0).apply{
        name = "Keyboard"
        price = 2500.00
        quantity = 3
    }.also{
        println("Product created: ${it.name}")
    }

    with (productKeyboard){
        println("Product: ${name}")
        println("price: ${price}")
        println("Quantity: ${quantity}")
    }


}