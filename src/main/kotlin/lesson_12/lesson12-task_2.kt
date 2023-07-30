package lesson_12

fun main() {
    val weatherOne = Weather(1, 2, 10, false)
    weatherOne.weatherInfo()

    val weatherTwo = Weather(4, 5, 15, false)
    weatherTwo.weatherInfo()

    val weatherThree = Weather(50, 60, 100, false)
    weatherThree.weatherInfo()
}

class Weather(
    private val daytimeTemperature: Int,
    private val nightTemperature: Int,
    private val atmosphericPressure: Int,
    private val wasItRaining: Boolean,
) {
    fun weatherInfo() {
        println(
            """    
        daytimeTemperature   = $daytimeTemperature
        nightTemperature     = $nightTemperature
        atmosphericPressure  = $atmosphericPressure
        wasItRaining         = $wasItRaining
        _________________________     
             """.trimIndent()
        )
    }
}