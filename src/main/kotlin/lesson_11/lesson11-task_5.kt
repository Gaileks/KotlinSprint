package lesson_11


fun main() {

    val forum = Forum()

    forum.createNewUser()
    forum.createNewUser()
    forum.createNewMessage(1, "Привет")
    forum.createNewMessage(2, "Как Дела")
    forum.createNewMessage(3, "Как Дела")
    forum.createNewMessage(1, "Норм")
    forum.printThread()

}

class Forum() {

    private var listMessage: MutableList<String> = mutableListOf()
    private var listUser: MutableList<User> = mutableListOf()

    fun printThread() {
        listMessage.forEach() {
            println(it)
        }
    }

    fun createNewMessage(authorId: Int, message: String) {
        listUser.forEach() {
            if (it.id == authorId) {
                listMessage.add("ID:${it.id}  ${it.login}: $message")
                return
            }
        }
        println("Пользователя с ID:${authorId} на форуме нет")
    }

    fun createNewUser() {
        val user = User(login = getLogin(), password = getPassword())
        listUser.add(user)
        println("Пользователь ID: ${user.id}, login: ${user.login}, добавлен на форум")
    }

    private fun getLogin(): String {
        return listOf(
            "Хлебуфек",
            "Плохая новость",
            "Нежданчик",
            "Музыка",
            "Маринад",
            "SуDьба",
            "Дитя Ночи",
            "Ванильный дождь",
            "Хулиганистан",
            "К ♡ тенка",
            "Хрустяшка",
            "МеLKая",
            "РОСКОМНАДЗОР",
            "Крылатый Олень",
            "Смайлик",
            "Мандаринка",
            "пЭрсик"
        ).random()

    }

    private fun getPassword(): String {
        return (10000..99999).random().toString()
    }
}

class User(
    val id: Int = getId(),
    val login: String,
    val password: String,
) {

    fun getInfo() {
        println(
            """
    id       = $id
    login    = $login
    password = $password
    _________________
      """.trimIndent()
        )
    }

    companion object {
        var numberOfInstance: Int = 1
        fun getId(): Int = numberOfInstance
    }

    init {
        numberOfInstance++
    }
}