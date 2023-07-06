package lesson_5

import java.time.LocalDate
import java.time.Period
 const val AGE = 18

fun main() {
    print("Введите свою дату рождения \nДень: ")
    val day = readln().toInt()
    print("Месяц: ")
    val month = readln().toInt()
    print("Год: ")
    val year = readln().toInt()
    val dateUser = LocalDate.of(year, month, day)
    val date = LocalDate.now()
    val period = Period.between(dateUser, date)


    if (period.years >= AGE) println("Показать экран со скрытым контентом")
    else println("Доступ запрещен")
}
