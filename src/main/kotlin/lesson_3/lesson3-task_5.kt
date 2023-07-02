package lesson_3

fun main() {
    val textThanks = "D2-D4;0"
    val fromWhere = "${textThanks[0]}${textThanks[1]}"
    val toWhere = "${textThanks[3]}${textThanks[4]}"
    val moveNumber = ("${textThanks[6]}").toInt()

    println(fromWhere)
    println(toWhere)
    println(moveNumber)
}

