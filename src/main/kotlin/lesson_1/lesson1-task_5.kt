package lesson_1

fun main() {
    val timeSeconds = 6490
    val timeMinutes = timeSeconds / 60
    val seconds = timeSeconds % 60
    println("$timeMinutes:$seconds")
}
