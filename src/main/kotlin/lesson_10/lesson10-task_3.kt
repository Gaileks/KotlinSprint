package lesson_10

fun main() {
    println("Введите длину пароля: ")
    println("Пароль: ${ password(readln().toInt()) }")
}
fun password(num: Int): String {
    val symbols = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', '-', '.', '/', ' ', ',')
    val numbers = (0..9)
    var str = ""

    repeat(num) {
        if (it % 2 == 0) {
            str += symbols.random()
        } else
            str += (numbers.random()).toString()
    }
    return str
}