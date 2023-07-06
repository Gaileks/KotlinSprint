package lesson_5

fun main() {
    println("2 + 2 =\nНапишите правильный ответ :")
    val number = readln().toInt()

    if (number == 4) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}