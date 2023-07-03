package lesson_3

fun main() {
    var fromWhere = "E2"
    var toWhere = "E4"
    var moveNumber = 1
    var statistics = "$fromWhere-$toWhere;$moveNumber"

    println(statistics)
    fromWhere = "D2"
    toWhere = "D3"
    moveNumber = 2
    statistics = "$fromWhere-$toWhere;$moveNumber"
    println(statistics)
}
