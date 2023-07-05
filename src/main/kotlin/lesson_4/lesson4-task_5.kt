package lesson_4

fun main() {
    val isHullDamage: Boolean
    val crew: Int
    val provisions: Int
    val isGoodWeather: Boolean
    val isReadyToSail: Boolean

    println("Есть ли повреждения корпуса(true/false): ")
    isHullDamage = readln() == "true"
    println("Текущая численность экипажа:")
    crew = readln().toInt()
    println("Текущее количество ящиков провизии:")
    provisions = readln().toInt()
    println("Благоприятные ли метеоусловия(true/false):")
    isGoodWeather = readln() == "true"

    isReadyToSail =
        (isHullDamage && crew > 55 && crew < 70 && provisions > 50) || ( crew == 70 && isGoodWeather && provisions > 50)

    println("Может ли корабль отправляться? $isReadyToSail ")
}
