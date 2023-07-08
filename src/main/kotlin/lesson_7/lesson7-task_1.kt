package lesson_7

fun main() {
    val num1 = (0..9).random()
    val num2 = ('a'..'z').random()
    val num3 = (0..9).random()
    val num4 = ('a'..'z').random()
    val num5 = (0..9).random()
    val num6 = ('a'..'z').random()
    val pas = "$num1$num2$num3$num4$num5$num6"

    println(pas)
}
