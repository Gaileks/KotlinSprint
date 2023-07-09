package lesson_7

fun main() {
    println("Введите количество секунд в таймере: ")
    val num = readln().toInt()
    for (i in 1..num) {
        Thread.sleep(1000)
        println("Прошло сек: $i")
        println("Времени осталось до конца: ${num - i} ")
    }
}