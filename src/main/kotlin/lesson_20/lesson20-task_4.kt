package lesson_20

fun main() {

    val list = mutableListOf(
        "1", "2", "3", "4",
        "5", "6", "7", "8",
        "9", "10", "11", "12"
    ).map { { println("Нажат элемент $it") } }

    for (i in 3..list.size step 4) {
        list[i]()
    }
}

