package lesson_12

import kotlin.random.Random

fun main() {
    val weatherByDays = mutableListOf<WeatherForDay>()

    repeat(10) {
        weatherByDays.add(WeatherForDay())
    }

    val (averageDaytimeTemperature,
        averageNightTemperature,
        averageAtmosphericPressure,
        rainyDays,
        ) = getWeatherStatistics(weatherByDays)

    println(
        """
        Среднее значение по температуре днем:  $averageDaytimeTemperature
        Среднее значение по температуре ночью: $averageNightTemperature
        Среднее атмосферное давление:          $averageAtmosphericPressure  
        Количество дождливых дней:             $rainyDays        
    """.trimIndent()
    )
}

fun getWeatherStatistics(weatherByDays: MutableList<WeatherForDay>): WeatherStatistics {
    val daytimeTemperatures = mutableListOf<Int>()
    val nightTemperatures = mutableListOf<Int>()
    val atmosphericPressures = mutableListOf<Int>()
    var rainyDays = 0

    weatherByDays.forEach() {
        daytimeTemperatures.add(it.daytimeTemperature)
        nightTemperatures.add(it.nightTemperature)
        atmosphericPressures.add(it.atmosphericPressure)
        if (it.wasItRaining) rainyDays++
    }
    return WeatherStatistics(
        daytimeTemperatures.average(),
        nightTemperatures.average(),
        atmosphericPressures.average(),
        rainyDays
    )
}

data class WeatherStatistics(
    val averageDaytimeTemperature: Double,
    val averageNightTemperature: Double,
    val averageAtmosphericPressure: Double,
    val rainyDays: Int,
    )

class WeatherForDay(
    var daytimeTemperature: Int = (0..30).random(),
    var nightTemperature: Int = (-15..20).random(),
    var atmosphericPressure: Int = (650..750).random(),
    var wasItRaining: Boolean = Random.nextBoolean()
) {
}