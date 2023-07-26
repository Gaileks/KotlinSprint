package lesson_10

fun main() {
    val password = (1000..9999).random().toString()
    val login = setLogin(password)

    passAuthorization(login, password)
    getSmsCode()
}

fun setLogin(password: String): String {
    var login = ""
    while (login.length < 4) {
        println("Придумайте и введите login(минимум 4 символа):")
        login = readln()
        if (login.length < 4) println("Логин менее 4 стмволов!")
    }
    println("Вашь password: $password")
    return login
}

fun passAuthorization(login: String, password: String) {
    do {
        println("Для авторизации введите login:")
        val loginVerification = readln()
        println("Для авторизации введите password:")
        val passwordVerification = readln()

        if (loginVerification != login || passwordVerification != password) {
            println("Неверный login или password!")
            println("Введите повторно login и password")
        }
    } while (loginVerification != login || passwordVerification != password)
}

fun getSmsCode() {
    do {
        val code = (1000..9999).random()
        println("Ваш код авторизации: $code ")
        println("Введите код из SMS: ")
        val sms = readln().toInt()
        if (code == sms) println("Добро пожаловать")
        else println("Код не совпадает, высылаю новый")
    } while (code != sms)
}