package lesson_4

fun main() {

    val isSunnyWeather = true
    val isAwningOpen = true
    val humidity = 20
    val season = "зима"
    val isGoodConditions = isSunnyWeather && isAwningOpen && (humidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodConditions")
}