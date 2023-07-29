package lesson_12

import lesson_12.WeatherDay.Companion.getWeatherByDay

fun main() {

    val weatherOne = WeatherDay(15, 2, 700)
    val weatherTwo = WeatherDay(4, -5, 750, false)
    val weatherThree = WeatherDay(30, 10, 730)
    val weatherByDay = listOf<WeatherDay>(weatherOne, weatherTwo, weatherThree)

    getWeatherByDay(weatherByDay)
}

class WeatherDay(
    private var daytimeTemperature: Int,
    private var nightTemperature: Int,
    private var atmosphericPressure: Int,
    private var wasItRaining: Boolean = true

) {
    companion object {
        fun getWeatherByDay(days: List<WeatherDay>) {
            var count = 0
            days.forEach() {
                println(
                    """
                День ${++count} погода: 
                Температура днем: ${it.daytimeTemperature}
                Температура ночью: ${it.nightTemperature}  
                Атмосферное давление: ${it.atmosphericPressure}
                Осадки, дождь: ${
                        if (it.wasItRaining) {
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
    }
}