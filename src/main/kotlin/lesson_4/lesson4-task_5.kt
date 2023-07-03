package lesson_4

fun main() {
    val hullDamage: Boolean
    val crew: Int
    val provisions: Int
    val goodWeather: Boolean

    println("Есть ли повреждения корпуса(true/false): ")
    hullDamage = readln() == "true"
    println("Текущая численность экипажа:")
    crew = readln().toInt()
    println("Текущее количество ящиков провизии:")
    provisions = readln().toInt()
    println("Благоприятные ли метеоусловия(true/false):")
    goodWeather = readln() == "true"

    val readyToSail =
        (hullDamage && crew > 55 && crew < 70 && provisions > 50) || (crew > 55 && crew == 70 && goodWeather)

    println("Может ли корабль отправляться? $readyToSail ")
}
