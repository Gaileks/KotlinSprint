package lesson_16

fun main() {

    Client().checkPassword(readln())
}

class Client(
    val login: String = "login",
    private val password: String = "123"
) {
    fun checkPassword(testWord: String) {

        if (testWord.equals(password, ignoreCase = true)) {
            println("Пароль подтвержден")
        } else {
            println("Пароль не подтвержден!")
        }
    }
}