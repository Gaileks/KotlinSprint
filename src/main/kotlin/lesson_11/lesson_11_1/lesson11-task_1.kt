package lesson_11.lesson_11_1

fun main() {

    val userOne = User(1, "логин1", "пароль1", "mail1")
    val userTwo = User(2, "логин2", "пароль2", "mail2")
    userOne.getInfo()
    userTwo.getInfo()

}

class User(
    private var id: Int,
    private var login: String,
    private var password: String,
    private var mail: String,
) {

    fun getInfo() {
        println(
            """
    id       = $id
    login    = $login
    password = $password
    mail     = $mail
    _________________          
      """.trimIndent()
        )
    }
}