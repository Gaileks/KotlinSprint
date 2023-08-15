package lesson_20

fun main() {

    val playerValera = PlayerValera(false)

    println(playerValera.checkAvailabilityOfKey())
}

class PlayerValera(
    private val availabilityOfKey: Boolean
) {
    val checkAvailabilityOfKey = {
        if (availabilityOfKey) {
            "Игрок дверь открыл"
        } else {
            "Дверь заперта"
        }
    }
}