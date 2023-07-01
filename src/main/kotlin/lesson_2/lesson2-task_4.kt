package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val crystalOreBuff = (crystalOre / 100.0 * buff).toInt()
    val ironOreOreBuff = (ironOre / 100.0 * buff).toInt()
    println("Crystal ore $crystalOreBuff")
    println("Iron ore $ironOreOreBuff")
}