package lesson_11.lesson_11_2


fun main() {

    val userOne = User(1, "Алекс", "1111", "mail")

    userOne.setBio()
    userOne.changePassword()
    userOne.getInfo()
    userOne.sendEmail(userOne.getPassword())
}

class User(
    private val id: Int,
    private val login: String,
    private var password: String,
    private val mail: String,
    private var bio: String = ""
) {

    fun getPassword() = password

    fun sendEmail(text: String) {
        println("Здравствуйте $login ваш новый пароль $text")
    }

    fun setBio() {
        println("Добавьте информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        do {
            println("Для изменения паролья введите текущий пароль:")
            val userPassword = readln()

            if (userPassword == password) {
                println("Введите новый пароль")
                password = readln()
                return
            } else {
                println("Неправильный пароль")
            }
        } while (true)
    }

    fun getInfo() {
        println(
            """
    id       = $id
    login    = $login
    password = $password
    mail     = $mail
    bio      = $bio
    _________________          
      """.trimIndent()
        )
    }
}