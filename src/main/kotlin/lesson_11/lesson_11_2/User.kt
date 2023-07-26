package lesson_11.lesson_11_2

class User(
    private var id: Int,
    private var login: String,
    private var password: String,
    private var mail: String,

    ) {
    private var bio: String = ""
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