package lesson_6

fun main() {
    val num = readln().toInt()
    var counter = 0
    while (counter != num) {
        Thread.sleep(1000)
        ++counter
    }
    println("Прошло $counter секунд")
}