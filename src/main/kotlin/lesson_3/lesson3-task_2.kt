package lesson_3

fun main() {
    val firstName = "Татьяна"
    val patronymic = "Сергеевна"
    var lastName = "Андреева"
    var years = 20

    println("ФИО: $lastName $firstName $patronymic возраст: ${years}г.")
    lastName = "Сидорова"
    years = 22
    println("ФИО: $lastName $firstName $patronymic возраст: ${years}г.")
}
