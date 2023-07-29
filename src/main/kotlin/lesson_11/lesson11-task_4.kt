package lesson_11


fun main() {
    val userOne = Contact(
        "First Name",
        "Second Name",
        89999994242,
        89998884242,
        "https://2",
        "mail@mail.ru",
        "mail@mail.ru",
        mutableListOf(),
    )
}


class Contact(
    private val firstName: String,
    private val secondName: String,
    private val cellPhone: Long,
    private val homePhone: Long,
    private val avatar: String,
    private val iCloud: String,
    private val mail: String,
    private val myContacts: MutableList<Contact>,
    private val nicName: String = "",

    ) {
    fun faceTime() {
        println("Для видозвонка наберите 1, для аудиозвонка наберите 2:")
        val call = readln().toInt()
        when (call) {
            1 -> makeVideoCall()
            2 -> callByPhone()
        }
    }

    fun checkEmail() {
        println("Проверить почту")
    }

    fun makeVideoCall() {
        println("Видео звонок")
    }

    fun callByPhone() {
        println("Телефонный звонок")
    }

    fun sms(sms: String) {
        println("Сообщение отправлено")
    }

    fun infoMyContacts() {
        myContacts.forEach() {
            println(
                """
                ${it.nicName}
                ${it.firstName} ${it.secondName}
                --------------------------------
            """.trimIndent()
            )
        }
    }
}