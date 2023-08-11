package lesson_17

fun main() {

    val chatUser = ChatUser("Приз","&%^(f")

    chatUser.login = "Машина"
    chatUser.password = "12"
    println(chatUser.password)
}

class ChatUser(login: String, password: String) {

    var login = login
        set(value) {
            println("Вы успешно поменяли свой логин")
            field = value
        }
    var password = password
        get() = "".padEnd(field.length, '*')

        set(value) {
            println("Вы не можете изменить пароль")
        }
}
