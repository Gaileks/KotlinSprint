package lesson_16

fun main() {

    println(Dice().getDiceSideNumber())

}

class Dice {
    private val diceSideNumber = (1..6).random()

    fun getDiceSideNumber() = diceSideNumber
}