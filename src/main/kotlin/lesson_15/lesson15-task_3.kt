package lesson_15

fun main() {
    val normalUser = NormalUser()
    val administrator = Administrator()

    normalUser.readTheMessage()
    normalUser.writeMessage()
    administrator.readTheMessage()
    administrator.writeMessage()
    administrator.deleteMessage()
}

abstract class User {

    fun readTheMessage() {
        println("Сообщение прочитано")
    }

    fun writeMessage() {
        println("Сообщение написано")
    }
}

class Administrator : User() {

    fun deleteMessage() {
        println("Сообщение удалено ")
    }
}

class NormalUser : User()