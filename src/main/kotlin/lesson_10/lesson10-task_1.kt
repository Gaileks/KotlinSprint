package lesson_10

fun main() {
    val person = getDiceRoll()
    val computer = getDiceRoll()

    println("Бросок Человека, выпало ${person.joinToString(", ")}")
    println("Бросок Компьютера, выпало ${computer.joinToString(", ")}")

    getWinner(person.sum(), computer.sum())
}

//fun getWinner(person: Int, computer: Int) {
//    when {
//        person > computer -> println("Победило человечество")
//        person < computer -> println("Победила машина")
//        else -> println("Равные результаты")
//    }
//}
//
//fun getDiceRoll(): List<Int> = listOf((1..6).random(), (1..6).random())
