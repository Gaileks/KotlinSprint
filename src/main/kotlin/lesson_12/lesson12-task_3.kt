package lesson_12

fun main() {

    val weatherOne = WeatherDay1(15, 2, 700)
    val weatherTwo = WeatherDay1(4, -5, 750, false)
    val weatherThree = WeatherDay1(30, 10, 730)
    val weatherByDay = listOf(weatherOne, weatherTwo, weatherThree)

    weatherByDay.forEach() {
        it.getWeatherByDay()
    }
}

class WeatherDay1(
    private var daytimeTemperature: Int,
    private var nightTemperature: Int,
    private var atmosphericPressure: Int,
    private var wasItRaining: Boolean = true
) {

    fun getWeatherByDay() {
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

