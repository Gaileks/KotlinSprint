package lesson_10

fun main() {
    val person = diceRoll()
    val computer = diceRoll()

    println("Бросок Человека, выпало ${person.joinToString(", ")}")
    println("Бросок Компьютера, выпало ${computer.joinToString(", ")}")

    winner(person.sum(), computer.sum())
}

fun winner(person: Int, computer: Int) {
    when {
        person > computer -> println("Победило человечество")
        person < computer -> println("Победила машина")
        else -> println("Равные результаты")
    }
}

fun diceRoll(): List<Int> = listOf((1..6).random(), (1..6).random())
