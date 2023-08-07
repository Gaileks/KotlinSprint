package lesson_12

fun main() {

    val weatherOne = WeatherDay(15, 2, 700)
    val weatherTwo = WeatherDay(4, -5, 750, false)
    val weatherThree = WeatherDay(30, 10, 730)
}

class WeatherDay(
    daytimeTemperature: Int,
    nightTemperature: Int,
    atmosphericPressure: Int,
    wasItRaining: Boolean = true
) {
    init {
        println(
            """
                Погода: 
                Температура днем: $daytimeTemperature
                Температура ночью: $nightTemperature  
                Атмосферное давление: $atmosphericPressure
                Осадки, дождь: ${
                if (wasItRaining) {
                    "да"
                } else {
                    "нет"
                }
            }
                _________________________
            """.trimIndent()
        )
    }
}