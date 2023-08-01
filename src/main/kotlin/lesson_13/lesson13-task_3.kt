package lesson_13


fun main() {

    val userCards = mutableListOf<UserCardNew>()

    userCards.addAll(
        listOf(
            UserCardNew("Ростислав", 89123456789, null),
            UserCardNew("Макс", 89999999, "Reddit"),
            UserCardNew("Игорь", 849570000, "adidas"),
            UserCardNew("Соня", 5555555, null),
        )
    )

    userCards.forEach { it.getContactInformation() }
}

class UserCardNew(
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
