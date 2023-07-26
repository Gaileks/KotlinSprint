package lesson_10

fun main() {

    launchTheGame()
}

fun launchTheGame() {
    do {
        val person = getDiceRoll()
        val computer = getDiceRoll()
        println("Бросок Человека, выпало ${person.joinToString(", ")}")
        println("Бросок Компьютера, выпало ${computer.joinToString(", ")}")
        getWinner(person.sum(), computer.sum())
        println("Хотите бросить кости еще раз Введите Да или Нет ")

    } while (readln().lowercase() == "да")

    GameStatistics.getInfo()
}

fun getWinner(person: Int, computer: Int) {
    when {
        person > computer -> {
            println("Победило человечество")
            GameStatistics.setManWonCount()
            GameStatistics.setRoundCount()
        }

        person < computer -> {
            println("Победила машина")
            GameStatistics.setComputerWonCount()
            GameStatistics.setRoundCount()
        }

        else -> {
            println("Равные результаты")
            GameStatistics.setDrawnGameCount()
            GameStatistics.setRoundCount()
        }
    }
}

fun getDiceRoll(): List<Int> = listOf((1..6).random(), (1..6).random())
