package lesson_13

fun main() {
    val userCards = addUserCard()

    userCards.forEach { it.getContactInformation() }
}

fun addUserCard(): List<UserCardTwo> {
    val userCards = mutableListOf<UserCardTwo>()
    var wordToCheck = "да"
    var name: String?
    var phoneNumber: Long?
    var company: String?

    do {
        println("Для добаления нового пользователя введите его данные:\nИмя: ")
        name = readln()
        println("№ телефона:")
        phoneNumber = readln().toLongOrNull()

        if (phoneNumber == null) {
            println("№ телефона это обязательный параметр, допускаются только цифры, введите контакт заново")
            continue
        }

        println("Название компании:")
        company = readln()

        if (company.isEmpty()) company = null
        if (name.isEmpty()) name = null

        userCards.add(UserCardTwo(name, phoneNumber, company))
        println("Если хотите добавить новую запись, введите \"да\"")
        wordToCheck = readln()

    } while (wordToCheck.equals("да", ignoreCase = true))
    return userCards
}

class UserCardTwo(
    private var name: String?,
    private var phoneNumber: Long?,
    private var company: String?
) {
    fun getContactInformation() {
        println("Имя: $name, Номер: $phoneNumber, Компания: $company")
    }
}
