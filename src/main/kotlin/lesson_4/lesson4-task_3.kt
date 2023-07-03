package lesson_4

fun main() {

    val sunnyWeather = true
    val awningOpen = true
    val humidity = 20
    val season = "зима"
    val goodConditions = sunnyWeather && awningOpen && (humidity == 20) && (season != "зима")

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")
}