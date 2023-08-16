package lesson_20

fun main() {
    val robot = Robot()

    robot.say()
}

class Robot(
    private val listOfPhrases: String = mutableListOf("Привет", "Пока", "Мозги", "Еда", "Вкусняшка").random(),
    private var modifier: (String) -> String = { it },
) {
    var setModifier: (String) -> String = {
        (it.reversed())
    }

    fun say() {
        println("Робот сказал")
        val robotPhrase = modifier(setModifier(listOfPhrases))
        println(robotPhrase)
        println("Перевод")
        println(setModifier(robotPhrase))
    }
}