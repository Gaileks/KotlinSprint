package lesson_4

fun main() {
    val isReadyToSail: Boolean

    println("Есть ли повреждения корпуса(true/false): ")
    val isHullDamage: Boolean = readln() == "true"
    println("Текущая численность экипажа:")
    val crew: Int = readln().toInt()
    println("Текущее количество ящиков провизии:")
    val provisions: Int = readln().toInt()
    println("Благоприятные ли метеоусловия(true/false):")
    val isGoodWeather: Boolean = readln() == "true"

    isReadyToSail =
        (!isHullDamage && crew > 55 && crew < 70 && provisions > 50) || ( crew == 70 && isGoodWeather && provisions > 50)

    println("Может ли корабль отправляться? $isReadyToSail ")
}
