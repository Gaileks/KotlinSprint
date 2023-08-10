package lesson_19

fun main() {

    val cardFileNew = CardFile()

    cardFileNew.listCardFile.forEach() {
        println("Имя: ${it.name} Пол ${it.gender.title}")
    }
}

class Human(val name: String, val gender: Gender)

enum class Gender(val title: String) {
    MAN("Мужской"),
    WOMAN("Женский"),
}

class CardFile {
    val listCardFile: List<Human>

    init {
        readManual()
        listCardFile = fillOutTheCardFile()
    }

    private fun fillOutTheCardFile(): List<Human> {
        val cardFileNew = mutableListOf<Human>()

        repeat(5) {
            println("№ ${it + 1} Введите имя:")
            cardFileNew.add(Human(readln(), getGender()))
        }
        return cardFileNew
    }

    private fun getGender(): Gender {
        println("Введите пол допустимые значения только :  Ж  или  М ")
        var gender: String

        do {
            gender = readln().lowercase()
            if (gender != "ж" && gender != "м") {
                println("допустимые значения только : Ж  или  М ")
            }
        } while (gender != "ж" && gender != "м")

        return when (gender) {
            "ж" -> Gender.WOMAN
            else -> Gender.MAN
        }
    }

    private fun readManual() {
        println(
            """
    Для заполнения картотеки введите пять пользователей в формате: (Имя, пол). 
    Имя человека может быть любым 
    Если пол женский, то следует ввести буку:  Ж 
    Если пол мужской, то следует ввести буку:  М 
    После каждого ввода имени или пола нажмите Enter

""".trimIndent()
        )
    }
}