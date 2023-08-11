package lesson_18

fun main() {

    val orders = listOf(
        OrderOne(1, "Капуста"),
        LargeOne(2, listOf("Картошка", "Бананы", "Масло"))
    )
    orders.forEach() {
        it.orderInfo()
    }
}

abstract class Order(
    orderNumber: Int,
) {
    abstract fun orderInfo()
}

class OrderOne(
    private val orderNumber: Int,
    private val products: String,
) : Order(orderNumber) {

    override fun orderInfo() {
        println("Номер заказа $orderNumber, «Заказан товар: $products» ")
    }
}

class LargeOne(
    private val orderNumber: Int,
    private val products: List<String>,
) : Order(orderNumber) {

    override fun orderInfo() {
        print("Номер заказа $orderNumber, ")
        println(products.joinToString(separator = ",", prefix = "«Заказаны следующие товары:", postfix = "»"))
    }
}