package lesson_7

fun main() {
    /** я конечно посмотрел все лекции  : )
     *  самый простой способ серез List
     */
//   val chs = ('a'..'z') + ('A'..'Z') + ('0'..'9')
//   val password= chs.random()
println("Введите количество символов: ")
    val num = readln().toInt()
    var password = ""
    for (i in 1..num) {
        password += when ((1..3).random()) {
            1 -> ('a'..'z').random().toString()
            2 -> (0..9).random().toString()
            3 -> ('A'..'Z').random().toString()
            else -> {}
        }
    }
    println(password)
}