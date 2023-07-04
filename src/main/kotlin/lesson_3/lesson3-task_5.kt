package lesson_3

fun main() {
    val textThanks = "D2-D4;0"
    var fromWhere = "${textThanks[0]}${textThanks[1]}"
    var toWhere = "${textThanks[3]}${textThanks[4]}"
    var moveNumber = ("${textThanks[6]}").toInt()

    println(fromWhere)
    println(toWhere)
    println(moveNumber)

    val list = textThanks.split("-", ";")
    fromWhere = list[0]
    toWhere = list[1]
    moveNumber = list[2].toInt()

    println(fromWhere)
    println(toWhere)
    println(moveNumber)
}

