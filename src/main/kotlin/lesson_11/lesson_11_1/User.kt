package lesson_11.lesson_11_1

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