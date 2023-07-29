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
    daytimeTemperature: Int,
    nightTemperature: Int,
    atmosphericPressure: Int,
    wasItRaining: Boolean,

    ) {
    private var daytimeTemperature = 0
    private var nightTemperature = 1
    private var atmosphericPressure = 700
    private var wasItRaining = true

    fun weatherInfo() {
        println(
            """    
        daytimeTemperature       = $daytimeTemperature
        nightTemperature         = $nightTemperature
        atmosphericPressure      = $atmosphericPressure
        wasItRaining             = $wasItRaining
         _________________       
""".trimIndent()
        )
    }
}