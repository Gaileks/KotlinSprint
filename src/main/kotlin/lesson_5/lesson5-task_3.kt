package lesson_5

fun main() {
    val numOne = 7
    val numTwo = 24
    print("Угадайте 2 числа из 100 и получите главный приз! Введите первое  число: ")
    val numUserOne = readln().toInt()
    print("Введите второе число: ")
    val numUserTwo = readln().toInt()

    if (numOne == numUserOne && numTwo == numUserTwo || numTwo == numUserOne && numOne == numUserTwo)
        println("Поздравляем! Вы выиграли главный приз!")
    else if (numOne == numUserOne || numOne == numUserTwo || numTwo == numUserOne || numTwo == numUserTwo)
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println("Правильный ответ\nПервое число: $numOne \nВторое число: $numTwo ")
}
