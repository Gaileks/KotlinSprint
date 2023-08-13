package lesson_20

fun main() {

    val list = mutableListOf(
        "1", "2", "3", "4",
        "5", "6", "7", "8",
        "9", "10", "11", "12"
    ).map { { println("Нажат элемент $it") } }

    list.filterIndexed { index, _ -> (index + 1) % 4 == 0 }.map { it() }
}

