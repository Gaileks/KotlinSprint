package lesson_6

fun main() {
    var count = 3
    do {
        val numOne = (1..9).random()
        val numTwo = (1..9).random()
        println("Напишите правильный ответ $numOne + $numTwo = ")
        val answer = numOne + numTwo
        if (readln().toInt() == answer) {
            println("Добро пожаловать!")
            count = 0
        } else {
            println("Доступ запрещен! Осталось попыток ${--count} ")
        }
    } while (count > 0)
}