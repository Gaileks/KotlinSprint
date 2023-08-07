package lesson_17

fun main() {

    val chatUser = ChatUser("Приз")

    chatUser.login = "Машина"
    chatUser.password = "12"
    chatUser.password
}

class ChatUser(login: String) {

    var login = login
        set(value) {
            println("Вы успешно поменяли свой логин")
            field = value
        }
    var password = "&*57"
        get() = repeat(field.length) {
            print("*")
        }.toString()
        set(value) {
            println("Вы не можете изменить пароль")
        }
}
