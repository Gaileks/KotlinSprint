package lesson_17

fun main() {

    val vessel = Vessel("Тихий", 12, "Большой порт Санкт-Петербург")

    vessel.name = "Ловкий"
    println(vessel.name)
}

class Vessel(
    name: String,
    averageSpeed: Int,
    homePort: String
) {
    var name = name
        set(value) {
            println("Внимание, имя у корабля менять нельзя!")
        }
}