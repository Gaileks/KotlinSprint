package lesson_6

fun main() {
    val num = (1..9).random()
    var count = 5

    do {
        if (readln().toInt() == num) {
            println("Это была великолепная игра!")
            count = 0
        } else println("Неверно\nОсталось попыток ${--count}")
    } while (count > 0)
    println("Было загадано число $num")
}