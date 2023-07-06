package lesson_5

fun main() {
    val userLogin = "Batman"
    val userPassword = "password"
    print("Введите login: ")
    val login = readln()

    if (userLogin == login) {
        print("Введите пароль: ")
        val password = readln()
        if (password == userPassword) print("Добро пожаловать $userLogin")
        else println("Пароль не подходит!")
    } else println("Зарегистрируйтесь")
}

