package lesson_8

fun main() {
    val viewsWeek = IntArray(7)

    for (i in viewsWeek.indices) {
        viewsWeek[i] = (0..5).random()
    }

    println("Просмотры по дням: ${viewsWeek.joinToString(", ")}")
    println("Просмотры за неделю:  ${viewsWeek.sum()}")
}