package lesson_20

fun main() {

    fun setModifier(ddd: () -> String) {

        val robotPhrase = ddd()
        println("Робот сказал $robotPhrase \nПереводим")
        println(robotPhrase.reversed())
    }

    val say = {
        mutableListOf("Привет", "Пока", "Мозги", "Еда", "Вкусняшка")
            .shuffled()[0]
            .reversed()
    }

    setModifier(say)
}

