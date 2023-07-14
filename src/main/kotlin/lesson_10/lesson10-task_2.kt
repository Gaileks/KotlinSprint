package lesson_10

fun main() {
    println("Введите login:")
    val login = readln()
    println("Введите password: ")
    val password = readln()

    wordLength(login, password)
}

fun wordLength(login: String, password: String) {
    when {
        login.length < 4 || password.length < 4 -> println("Логин или пароль недостаточно длинные")
        else -> println("Добро пожаловать")
    }
}