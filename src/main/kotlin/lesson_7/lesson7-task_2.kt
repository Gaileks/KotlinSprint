package lesson_7

fun main() {
    do {
        val password = (1000..9999).random()
        println("Ваш код авторизации: $password ")
        println("Введите код из SMS: ")
        val sms = readln().toInt()
        if (password == sms) println("Добро пожаловать")
        else println("Код не совпадает, высылаю новый")
    } while (password != sms)
}