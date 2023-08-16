package lesson_20

fun main() {

    val list = mutableListOf(
        "0", "1", "2", "3",
        "4", "5", "6", "7",
        "8", "9", "10", "11"
    ).map { { println("Нажат элемент $it") } }.filterIndexed { index, _ -> index % 2 == 0 }.map { it() }
}


