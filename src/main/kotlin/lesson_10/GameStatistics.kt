package lesson_10

enum class GameStatistics(private var count: Int) {
    MAN_WON(0),
    COMPUTER_WON(0),
    DRAWN_GAME(0),
    ROUND(0);

    companion object {
        fun setManWonCount() {
            MAN_WON.count += 1
        }

        fun setComputerWonCount() {
            COMPUTER_WON.count += 1
        }

        fun setDrawnGameCount() {
            DRAWN_GAME.count += 1
        }

        fun setRoundCount() {
            ROUND.count += 1
        }

        fun getInfo() {
            println(
                """
        Раундов игры проведено: ${ROUND.count}
        Человек победил       : ${MAN_WON.count}
        Компьютер победил     : ${COMPUTER_WON.count}
        Равные результаты     : ${DRAWN_GAME.count}
    """.trimIndent()
            )
        }
    }
}