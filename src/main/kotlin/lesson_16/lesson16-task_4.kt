package lesson_16

fun main() {

    Order(1).changeOrderStatus("Готовится")
}

class Order(
    val orderNumber: Int,
    private var readyStatus: String? = null
) {

    fun getReadyStatus() = readyStatus

    private fun setReadyStatus(status: String) {
        readyStatus = status
    }

    fun changeOrderStatus(status: String) {
        println("Текущий статус заказа: ${readyStatus ?: "\"без статуса\""} изменен на: $status  ")
        setReadyStatus(status)
    }
}