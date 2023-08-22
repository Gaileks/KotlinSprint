package lesson_20

fun main() {
    val robot = Robot()

    robot.setModifier { modifier: String ->
        modifier.reversed()
    }

    robot.say()
}

class Robot(
    private val listOfPhrases: String = getWordRobot(),
    private  var modifier: (String) -> String = { it },
) {
    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

    fun say()
    {
        println("Робот сказал")
        val robotPhrase = modifier(listOfPhrases)
        println(robotPhrase)
        println("Перевод")
        println(modifier(robotPhrase))
    }
}

private fun getWordRobot() = mutableListOf("Привет", "Пока", "Мозги", "Еда", "Вкусняшка").random()