package lesson_11.lesson_11_2


fun main() {

    val user1 = User(1, "Алекс", "1111", "mail")

    user1.setBio()
    user1.changePassword()
    user1.getInfo()
    user1.sendEmail(user1.getPassword())
}