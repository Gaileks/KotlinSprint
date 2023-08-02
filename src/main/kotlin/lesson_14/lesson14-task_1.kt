package lesson_14

fun main() {

    val standardShip = StandardShip("Смелый", 10, 15)

    standardShip.getNameInfo()
    standardShip.getLoadCapacityInfo()
    standardShip.getSpeedInfo()
}

class StandardShip(
    private val name: String,
    private val speed: Int,
    private val loadCapacity: Int,
) {

    fun getNameInfo() {
        println("Название корабля: $name")
    }

    fun getSpeedInfo() {
        println("Скорость корабля: $speed")
    }

    fun getLoadCapacityInfo() {
        println("Перевозит ящиков груза: $loadCapacity")
    }

}