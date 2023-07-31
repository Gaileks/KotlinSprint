package lesson_13

fun main() {
    val userCard = UserCard("Ростислав", 89123456789, null)
    val userCardTwo = UserCard("Ростислав", 89123456789, "Reddit")

    userCard.getContactInformation()
    userCardTwo.getContactInformation()
}

class UserCard(
    private var name: String,
    private var phoneNumber: Long,
    private var company: String?
) {
    fun getContactInformation() {
        println(
            """
            Имя: $name
            Номер: $phoneNumber
            Компания: ${company ?: "не указано"} 
            
             """.trimIndent()
        )
    }
}
