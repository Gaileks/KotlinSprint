package lesson_10

import java.util.*

fun main() {

    launchTheGame()
}

fun recordGameStatistics(statistics: MutableList<Int>, num: Int): MutableList<Int> {

    when (num) {
        1 -> statistics[0] += 1
        2 -> statistics[1] += 1
        3 -> statistics[2] += 1
    }
    return statistics
}

fun launchTheGame() {
    var statistics = mutableListOf(0, 0, 0)
    var count = 0
    val person = getDiceRoll()
    val computer = getDiceRoll()

    do {
        println("Бросок Человека, выпало ${person.joinToString(", ")}")
        println("Бросок Компьютера, выпало ${computer.joinToString(", ")}")
        statistics = recordGameStatistics(statistics, getWinner(person.sum(), computer.sum()))
        count++
        println("Хотите бросить кости еще раз Введите Да или Нет ")

    } while (readln().capitalizeNew() == "Да")

    getGameStatistics(statistics, count)
}

fun getGameStatistics(statistics: MutableList<Int>, count: Int) {

    println(
        """
        Раундов игры проведено: $count
        Человек победил       : ${statistics[0]}
        Компьютер победил     : ${statistics[1]}
        Равные результаты     : ${statistics[2]}
    """.trimIndent()
    )
}

fun getWinner(person: Int, computer: Int): Int {
    return when {
        person > computer -> {
            println("Победило человечество")
            1
        }

        person < computer -> {
            println("Победила машина")
            2
        }

        else -> {
            println("Равные результаты")
            3
        }
    }
}

fun String.capitalizeNew(): String =
    replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }

fun getDiceRoll(): List<Int> = listOf((1..6).random(), (1..6).random())
