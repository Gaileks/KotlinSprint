package lesson_6

fun main() {
    print("Придумайте и напишите свой логин: ")
    val login = readln()
    print("Придумайте и напишите свой пароль: ")
    val password = readln()
    println("Приветствуем вас $login, для авторизации введите свой пароль: ")
    while (readln() != password) println("Пароль не подходит, попробуйте еще раз ")
    println("Авторизация прошла успешно")
}
