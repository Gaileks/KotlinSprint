package lesson_4

fun main() {

    val tablesTotal = 13
    val reserveToday = 13
    val reserveTomorrow = 9

    println("Доступность столиков на сегодня: ${reserveToday != tablesTotal}" +
            "\nДоступность столиков на завтра: ${reserveTomorrow != tablesTotal}")
}