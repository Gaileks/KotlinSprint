package lesson_14

fun main() {

    val standardShip = StandardShip("Смелый", 20, 15)
    val icebreakerShip = IcebreakerShip("Сильный", 25, 20)
    val cargoShip = CargoShip("Тяжелый", 20, 25)

    standardShip.getShipInfo()
    icebreakerShip.getShipInfo()
    cargoShip.getShipInfo()
}

open class StandardShip(
    val name: String,
    var speed: Int,
    var loadCapacity: Int,
) {

    open fun getShipInfo() {
        getNameInfo()
        getSpeedInfo()
        getLoadCapacityInfo()
    }

    open fun getNameInfo() {
        println("\nНазвание корабля: \"$name\"")
    }

    private fun getSpeedInfo() {
        println("Скорость корабля: $speed")
    }

    private fun getLoadCapacityInfo() {
        println("Перевозит ящиков груза: $loadCapacity")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int
) : StandardShip(name, speed, loadCapacity) {

    override fun getShipInfo() {
        activateCargoModule()
        super.getShipInfo()
    }

    private fun activateCargoModule() {
        println("\n\"$name\" Активировал  грузовой модуль")
        speed /= 2
        loadCapacity *= 3
    }

    override fun getNameInfo() {
        println("Название корабля: \"$name\"")
    }
}

class IcebreakerShip(
    name: String,
    speed: Int,
    loadCapacity: Int
) : StandardShip(name, speed, loadCapacity) {

    override fun getShipInfo() {
        super.getShipInfo()
        startSplittingIce()
    }

    private fun startSplittingIce() {
        println("\"$name\" Колет лед")
    }
}

